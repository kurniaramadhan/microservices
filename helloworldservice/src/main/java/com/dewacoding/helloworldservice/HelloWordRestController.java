package com.dewacoding.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello world, welcome to Microservice Architecture";
	}
}
