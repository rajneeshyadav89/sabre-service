package com.aa.apauto.sabrewebservices.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SwsConnectionPoolConfig {
	
	@Value("${apauto.swsservice.connectionPoolConfig.connectionTimeoutInSeconds}")
	private int connectionTimeoutInSeconds;
	
	@Value("${apauto.swsservice.connectionPoolConfig.connectionRequestTimeoutInSeconds}")
	private int connectionRequestTimeoutInSeconds;
	
	@Value("${apauto.swsservice.connectionPoolConfig.socketTimeoutInSeconds}")
	private int socketTimeoutInSeconds;
	
	@Value("${apauto.swsservice.connectionPoolConfig.connectionKeepAliveInSeconds}")
	private int connectionKeepAliveInSeconds;
	
	@Value("${apauto.swsservice.connectionPoolConfig.maxConnections}")
	private int maxConnections;
	


	public int getConnectionTimeoutInSeconds() {
		return connectionTimeoutInSeconds;
	}

	public int getConnectionRequestTimeoutInSeconds() {
		return connectionRequestTimeoutInSeconds;
	}

	public int getSocketTimeoutInSeconds() {
		return socketTimeoutInSeconds;
	}
	
	public int getConnectionKeepAliveInSeconds() {
		return connectionKeepAliveInSeconds;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

}
