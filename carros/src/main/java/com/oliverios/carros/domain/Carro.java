package com.oliverios.carros.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	public Carro() {
		// Construtor sem parametro necessario pro spring autoCriar no formato DDL do banco
	}
	
	public Carro(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	// GetSet Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	// GetSet Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
