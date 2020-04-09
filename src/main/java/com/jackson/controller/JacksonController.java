package com.jackson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JacksonController {
	@GetMapping("/")
	public String getMesssage(){
		return "Welcome to GitAWSCodeDeploy";
	}
	@GetMapping("/aws")
	public String getAWS() {
		return "Welcome to AWS";
	}
}
