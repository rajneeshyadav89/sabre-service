package com.aa.apauto.sabrewebservices.configuration;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.pool.PoolStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SwsHttpConnectionPoolStats {

	private static final Logger logger = LoggerFactory.getLogger(SwsHttpConnectionPoolStats.class);

	private PoolingHttpClientConnectionManager poolingHttpClientConnectionManager;

	public void setPoolingHttpClientConnectionManager(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager) {
		this.poolingHttpClientConnectionManager = poolingHttpClientConnectionManager;
	}

	public void getHttpConnectionPoolStats() {
		PoolStats poolStats = poolingHttpClientConnectionManager.getTotalStats();
		StringBuilder buf = new StringBuilder();
		buf.append("[total kept alive: ").append(poolStats.getAvailable()).append("; ");
		buf.append("total allocated: ").append(poolStats.getLeased() + poolStats.getAvailable());
		buf.append(" of ").append(poolStats.getMax()).append("]");
		logger.debug(buf.toString());
	}
}
