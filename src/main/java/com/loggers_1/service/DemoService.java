package com.loggers_1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
	private Logger log=LoggerFactory.getLogger(DemoService.class);
	
	public void loggerStart(int num) {
		if(num>1)
		log.info("number more than 1");
		
	}
}
