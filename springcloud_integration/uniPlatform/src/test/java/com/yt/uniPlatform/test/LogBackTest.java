package com.yt.uniPlatform.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogBackTest.class);

	public static void main(String[] args) {
		LOGGER.info("info!");
		LOGGER.error("error!");
	}
}
