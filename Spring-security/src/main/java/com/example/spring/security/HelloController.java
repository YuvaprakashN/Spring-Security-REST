package com.example.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String hello() {
		return "HEllo World";
	}
	
	@GetMapping("bye")
	public String bye() {
		return "BYE";
	}
}
