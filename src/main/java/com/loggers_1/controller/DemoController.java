package com.loggers_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loggers_1.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/doit")
	public void name() {
		demoService.loggerStart(6);
	}

}
