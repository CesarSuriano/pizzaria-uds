package com.example.pizzaria.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.pizzaria.model.Pizza;

public interface PizzaService {
	public Pizza save(Pizza pizza);
	
	public ResponseEntity<?> delete(Long id);
	
	public ResponseEntity<Pizza> update(Long id, Pizza pizza);
	
	public ResponseEntity<Pizza> getById(Long id);
	
	public List<Pizza> findAll();
	
}
