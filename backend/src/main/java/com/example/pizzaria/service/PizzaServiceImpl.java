package com.example.pizzaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.pizzaria.model.Pizza;
import com.example.pizzaria.repository.PizzaRepository;

@Component
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	
	@Override
	public Pizza save(Pizza pizza) {
		return repository.save(pizza);
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Pizza> update(Long id, Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Pizza> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> findAll() {
		 Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "id");
	     return repository.findAll(sortByCreatedAtDesc);
	}


}
