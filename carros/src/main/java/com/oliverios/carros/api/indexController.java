package com.oliverios.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexController {
	
	@GetMapping()
	public String get() {
		return "Get Spring Boot";
	}
	
	@GetMapping("/login/{login}/senha/{senha}")
	public String login(@PathVariable("login") String login, @PathVariable("senha") String senha) {
		return "Login " + login + ", senha: " + senha;
	}
	
	@GetMapping("/carros/{id}")
	public String getCarroById(@PathVariable Long id) {
		return "Carro by id " + id;
	}

	@GetMapping("/carros/tipo/{tipo}")
	public String getCarroById(@PathVariable String tipo) {
		return "Lista de Carros " + tipo;
	}
	
//	@GetMapping("/login")
//	public String login(@RequestParam("login") String login, @RequestParam("senha") String senha) {
//		return "Login " + login + ", senha: " + senha;
//	}
	
//	@PostMapping()
//	public String post() {
//		return "Post Spring Boot";
//	}
//
//	@PutMapping()
//	public String put() {
//		return "Put Spring Boot";
//	}
//	
//	@DeleteMapping()
//	public String delete() {
//		return "Delete Spring Boot";
//	}
	
//	@GetMapping("/teste")
//	public String teste() {
//		return "Teste Spring Boot";
//	}
}
 