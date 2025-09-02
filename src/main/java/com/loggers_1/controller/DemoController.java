package com.loggers_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loggers_1.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/doit/{num}")
	public void name(@PathVariable int num) {
		demoService.loggerStart(num);
	}

}
