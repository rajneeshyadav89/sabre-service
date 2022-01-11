package com.aa.apauto.sabrewebservices.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.opentravel.ota._2003._05.OTAPingRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.aa.apauto.sabrewebservices.configuration.SwsConfiguration;

@Service
@EnableScheduling
public class SessionPool implements DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(SessionPool.class);

    private class SabreConnection {
        private long creationTime = 0;
        private long refreshedTime = 0;
        private Security security;

        public SabreConnection(long creationTime, long refreshedTime, Security security) {
            this.creationTime = creationTime;
            this.refreshedTime = refreshedTime;
            this.security = security;
        }

        public long getCreationTime() {
            return creationTime;
        }


        public long getRefreshedTime() {
            return refreshedTime;
        }

        public Security getSecurity() {
            return security;
        }

        public void setRefreshedTime(long refreshedTime) {
            this.refreshedTime = refreshedTime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof SabreConnection))
                return false;
            SabreConnection that = (SabreConnection) o;
            return Objects.equals(getSecurity(), that.getSecurity());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getSecurity());
        }
    }

    private Map<String, SabreConnection> busy;

    private SessionService sessionService;
    private PingService pingService;
    private SwsConfiguration swsConfiguration;

    private BlockingQueue<SabreConnection> available;

    private int sessionCount = 1;
    private long poolCreationTime = System.currentTimeMillis();

    public void addToPool(Security session) {
        boolean added = available
                .offer(new SabreConnection(System.currentTimeMillis(), System.currentTimeMillis(), session));
        logger.debug("Added to pool? " + added + " busy size " + busy.size() + " available  size: " + available.size()
                + " remaining capacity :" + available.remainingCapacity());
    }

  // @PostConstruct
    public void initializeSessionPool() {
        poolCreationTime = System.currentTimeMillis();
        int size = swsConfiguration.getSwsQueueSize();
        if (available == null) {
            createNewPool(size);
        } else {
            recreateNewPool(size);
        }
    }

    private void recreateNewPool(int size) {
        for (int i = 0; (i < available.size() && i < size); i++) {
            try {
                SabreConnection session = available.take();
                if (session.getCreationTime() < poolCreationTime) {
                    createNewConnection(session.getSecurity());
                } else {
                    available.offer(session);
                }
            } catch (Exception e) {
                logger.error("Unable to create a new session" + e.getMessage());
            }
        }
    }

    private void createNewPool(int size) {
        available = new LinkedBlockingQueue<>(size);
        busy = new ConcurrentHashMap<>();
        for (int i = 0; i < size; i++) {
            createNewConnection(null);
        }
    }

    public Security getFromPool(String id) throws Exception {
        logger.debug("Looking for session for ConversationID: " + id);
        SabreConnection result = busy.get(id);
        if (result != null) {
            logger.debug("Found session for ConversationID: " + id);
            result.setRefreshedTime(System.currentTimeMillis());
            return result.getSecurity();
        } else {
            logger.debug("Did not find a session for the conversationID: " + id);
            try {
                logger.debug("Waiting for available session for ConversationID:" + id);
                if (available.size() + busy.size() == 0)
                    throw new Exception("SWS Session Pool Exhausted");
                result = available.take();
                busy.put(id, result);
            } catch (Exception e) {
                String errorMessage = "Could not get connection from pool";
                logger.error(errorMessage, e);
                throw new Exception(errorMessage, e);
            }
            return result.getSecurity();
        }
    }

    public void returnToPool(String conversationId, boolean recreate) {
        logger.debug("Returning session for ConversationID: " + conversationId);
        SabreConnection toReturn = busy.get(conversationId);
        if (recreate) {
            busy.remove(conversationId);
            createNewConnection(toReturn.getSecurity());
            return;
        }
        if (toReturn != null) {
            if (!available.contains(toReturn)) {
                if (toReturn.getCreationTime() < poolCreationTime) {
                    createNewConnection(toReturn.getSecurity());
                } else {
                    boolean added = available.offer(toReturn);
                    logger.debug("Returned to pool? " + added);
                }
            } else {
                logger.debug("This session is already in pool.");
            }
        } else {
            logger.debug("No session in the busy map for ConversationID: " + conversationId);
            logger.debug("Busy map size: " + busy.size());
            logger.debug("Available queue size: " + available.size());
        }
        busy.remove(conversationId);
    }

    @Scheduled(cron = "${apauto.swsservice.scheduler.recreatePool}")
    public void recreatePool() {
        initializeSessionPool();
    }

    private boolean refresh(Security session) {
        OTAPingRS otaPingRS = pingService.executePing(session);
        if (otaPingRS.getErrors() != null) {
            return false;
        }
        return true;
    }

    private void createNewConnection(Security session) {
        logger.debug("createNewConnection : ");
        if (available.size() + busy.size() < swsConfiguration.getSwsQueueSize()) {
            logger.debug("createNewConnection : apauto_" + sessionCount);
            sessionService.createSession("apauto_" + sessionCount++);
            if (session != null) {
                sessionService.closeSession(session, "apauto_CLOSE_CONNECTION");
            }
        }
    }

    /**
     * Refreshes all available session at a fixed time rate, and find expired
     * session replace with new.
     */
    @Scheduled(fixedRateString = "${apauto.swsservice.scheduler.refreshAll.fixedRate}", initialDelayString = "${apauto.swsservice.scheduler.refreshAll.intialDelay}")
    public void refreshAll() {
        // In case the connection is struck in busy state for more than 2 min;
        logger.info("******************Running refresh for ALL Connections***************");
        validateBusyPoolForStalled();
        // Now refresh the available pool.
        refreshAvailablePool();
//	        recreateMissingConnections();

    }

    @Scheduled(fixedRateString = "${apauto.swsservice.scheduler.recreateMissingConnection.fixedRate}", initialDelayString = "${apauto.swsservice.scheduler.recreateMissingConnection.intialDelay}")
    public void recreateMissingConnections() {
        logger.info("******************Running refresh for Missing Connections***************");
        // It will try to create the token again to match the pre-defined pool size
        int actualSize = available.size() + busy.size();
        int missingTokenCount = swsConfiguration.getSwsQueueSize() - actualSize;
        if (swsConfiguration.getSwsQueueSize() != actualSize) {
            logger.warn("Found Miss matched size in SWS session pool Expected : " + swsConfiguration.getSwsQueueSize()
                    + " but Actual :" + actualSize);
        }
        if (missingTokenCount > 0) {
            for (int i = 0; i < missingTokenCount; i++) {
                createNewConnection(null);
            }
        } else if (missingTokenCount < 0) {
            for (int i = missingTokenCount; i < 0; i++) {
                try {
                    sessionService.closeSession(available.take().getSecurity(), "apauto_CLOSE_EXTRA_CONNECTION");
                } catch (Exception e) {
                    logger.error("Unable to close extra connection in pool" + e.getMessage());
                }
            }
        }
    }

    private void refreshAvailablePool() {
        int invalidSecuritySize = 0;
        for (int i = 0; i < available.size(); i++) {
            try {
                SabreConnection session = available.take();
                if (!refresh(session.getSecurity())) {
                    invalidSecuritySize++;
                    try {
                        sessionService.closeSession(session.getSecurity(), "apauto_CLOSE_REFRESH_INVALID");
                    } catch (Exception e) {
                        logger.error("Unable to close refresh invalid connection in pool" + e.getMessage());
                    }
                } else {
                    session.setRefreshedTime(System.currentTimeMillis());
                    available.offer(session);
                }
            } catch (Exception e) {
                logger.error("Unable to refresh the session" + e.getMessage());
            }
        }
        for (int i = 0; i < invalidSecuritySize; i++) {
            createNewConnection(null);
        }
    }

    private void validateBusyPoolForStalled() {
        long twoMinutesBefore = System.currentTimeMillis() - 120000;
        Set<Entry<String, SabreConnection>> entrySet = busy.entrySet();
        Iterator<Entry<String, SabreConnection>> iter = entrySet.iterator();
        while (iter.hasNext()) {
            Entry<String, SabreConnection> entry = iter.next();
            try {
                if (entry.getValue().getRefreshedTime() < twoMinutesBefore) {
                    if (!available.contains(entry.getValue())) {
                        if (entry.getValue().getCreationTime() < poolCreationTime) {
                            createNewConnection(entry.getValue().getSecurity());
                        } else {
                            boolean added = available.offer(entry.getValue());
                            logger.debug("validateBusyPoolForStalled Returned to pool? " + added + " busy size "
                                    + busy.size() + " available size: " + available.size() + " remaining capacity :"
                                    + available.remainingCapacity());
                        }
                    }
                    iter.remove();
                }
            } catch (Exception e) {
                logger.error("Unable to validate busy pool so ignoring the busy state pool" + e.getMessage());
            }
        }
    }

    @Override
    public void destroy() throws Exception {
        int i = 0;
        while (!available.isEmpty()) {
            try {
                sessionService.closeSession(available.take().getSecurity(), ("apauto_" + i++));
            } catch (Exception e) {
                logger.error("Unable to close available pool" + e.getMessage());
            }
        }
        for (Entry<String, SabreConnection> entry : busy.entrySet()) {
            try {
                sessionService.closeSession(busy.get(entry.getKey()).getSecurity(), ("apauto_" + i++));
            } catch (Exception e) {
                logger.error("Unable to close busy state pool" + e.getMessage());
            }
        }
    }

    @Autowired
    public void setSwsConfiguration(SwsConfiguration swsConfiguration) {
        this.swsConfiguration = swsConfiguration;
    }

    @Autowired
    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @Autowired
    public void setPingService(PingService pingService) {
        this.pingService = pingService;
    }

    public int dTAvailableSessionSize() {
        return this.available.size();
    }

    public int dTBusySessionSize() {
        return this.busy.size();
    }

    public int dTTotalSessionSize() {
        return this.swsConfiguration.getSwsQueueSize();
    }

    // @Scheduled(cron = "${sws-service.scheduler.refresh}")
    public void scheduleRefresh() {

    }
}
