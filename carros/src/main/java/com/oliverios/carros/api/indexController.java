package com.oliverios.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {
	
	@GetMapping()
	public String hello() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Teste Spring Boot";
	}
}
