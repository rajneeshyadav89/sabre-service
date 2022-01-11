package com.aa.apauto.sabrewebservices.core;

import java.util.UUID;

public class ThreadSessionPoolId {

	private ThreadSessionPoolId() {

	}

	private static final ThreadLocal<String> threadId = ThreadLocal.withInitial(() -> {
		return UUID.randomUUID().toString();
	});

	public static String get() {
		return threadId.get();
	}

	public static void clean() {
		threadId.remove();
	}

}
