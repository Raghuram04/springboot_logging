package com.weblearner.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	private Logger logger = LogManager.getLogger(LoggingController.class);

	@RequestMapping("/log")
	public void logGenerator() {
		
		while(true) {		
		logger.info("Welcome to logging tutorial with Spring boot");
		logger.warn("Warning msg");
		logger.error("ERROR msg");
		logger.trace("Trace msg");
		}

	}

}
