package com.aa.apauto.sabrewebservices.configuration;

import com.testingsyndicate.hc.jmx.HcJmx;
import com.testingsyndicate.hc.jmx.HcJmxException;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.springframework.stereotype.Service;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import javax.management.JMException;
import javax.management.ObjectName;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@Service
public class SwsHttpComponentsMessageSender extends HttpComponentsMessageSender {
	
	private static final int CONST_THOUSAND = 1000;

	private ObjectName objectName;
	private SwsConnectionPoolConfig swsConnectionPoolConfig;
	private SwsHttpConnectionPoolStats swsHttpConnectionPoolStats;

	public SwsHttpComponentsMessageSender(SwsConfiguration swsConfiguration, SwsConnectionPoolConfig swsConnectionPoolConfig, SwsHttpConnectionPoolStats swsHttpConnectionPoolStats) {
		this.swsConnectionPoolConfig = swsConnectionPoolConfig;
		this.swsHttpConnectionPoolStats = swsHttpConnectionPoolStats;
		RequestConfig.Builder requestBuilder = RequestConfig.custom()
				.setConnectTimeout(swsConnectionPoolConfig.getConnectionTimeoutInSeconds() * CONST_THOUSAND)
				.setConnectionRequestTimeout(swsConnectionPoolConfig.getConnectionRequestTimeoutInSeconds() * CONST_THOUSAND)
				.setSocketTimeout(swsConnectionPoolConfig.getSocketTimeoutInSeconds() * CONST_THOUSAND);
		setHttpClient(HttpClientBuilder.create().setConnectionManager(buildConnectionManager()).addInterceptorFirst(new RemoveSoapHeadersInterceptor())
					.setDefaultRequestConfig(requestBuilder.build()).setKeepAliveStrategy(new CustomConnectionKeepAliveStrategy()).build());

	}

	private PoolingHttpClientConnectionManager buildConnectionManager() {

		SSLContext sslContext = null;
		try {
			sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, null, null);
		} catch (NoSuchAlgorithmException | KeyManagementException e) {
			//LOGGER.error("Error while creating SSL Conetxt", e);
		}

		SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext,
				new String[] { "TLSv1.2" }, null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());

		Registry<ConnectionSocketFactory> reg = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("http", sslSocketFactory).register("https", sslSocketFactory).build();

		PoolingHttpClientConnectionManager poolManager = new PoolingHttpClientConnectionManager(reg);
		poolManager.setMaxTotal(swsConnectionPoolConfig.getMaxConnections());
		poolManager.setDefaultMaxPerRoute(swsConnectionPoolConfig.getMaxConnections());
		try {
			objectName = HcJmx.getInstance().register(poolManager, "JmxHttpConnectionSws");
		} catch(HcJmxException e) {
			//LOGGER.error("Exception occured while registering PoolingHttpClientConnectionManager to JMX Server", e);
		}
		swsHttpConnectionPoolStats.setPoolingHttpClientConnectionManager(poolManager);
		poolManager.closeExpiredConnections();
		return poolManager;
	}

	protected static class RemoveSoapHeadersInterceptor implements HttpRequestInterceptor {

		@Override
        public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
            if (request instanceof HttpEntityEnclosingRequest) {
                if (request.containsHeader(HTTP.TRANSFER_ENCODING)) {
                    request.removeHeaders(HTTP.TRANSFER_ENCODING);
                }
                if (request.containsHeader(HTTP.CONTENT_LEN)) {
                    request.removeHeaders(HTTP.CONTENT_LEN);
                }
            }
        }
    }
	
	protected class CustomConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {

	    @Override
	    public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
	        HeaderElementIterator it = new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
	        while (it.hasNext()) {
	            HeaderElement he = it.nextElement();
	            String param = he.getName();
	            String value = he.getValue();
	            if (value != null && "timeout".equalsIgnoreCase(param)) {
	                return Long.parseLong(value) * CONST_THOUSAND;
	            }
	        }
	        return (long)swsConnectionPoolConfig.getConnectionKeepAliveInSeconds() * CONST_THOUSAND;
	    }

	}
	
	public void cleanUp() {
		//LOGGER.debug("Unregister PoolingHttpClientConnectionManager from JMX Server");
		try {
			HcJmx.getInstance().unregister(objectName);
		} catch (JMException e) {
		//	LOGGER.error("Excpetion occured while unregister JMX Bean", e);
		}
	}
}
