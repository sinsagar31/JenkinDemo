package com.pharma.targeting.eshot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class CreateEShotController {
	
	@GetMapping("/")
	public 	String getString()
	{
//		log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
//        log.info("An INFO Message");
//        log.warn("A WARN Message");
//        log.error("An ERROR Message");
		return "Hi How are you";
	}
	
}
