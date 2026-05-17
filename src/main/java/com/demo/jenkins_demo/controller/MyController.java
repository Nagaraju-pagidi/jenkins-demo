package com.demo.jenkins_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/greet")
	public String greet() {
		return "Finally CI / CD completed...";
	}
}
