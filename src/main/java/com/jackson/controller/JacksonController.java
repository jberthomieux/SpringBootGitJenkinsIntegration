package com.jackson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacksonController {
@GetMapping("/")
	public String getMesssage(){
		return "Welcome to SprBootGitJenkinsIntegration";
	}
}
