package com.example.pizzaria.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pizzaria.model.Pizza;
import com.example.pizzaria.service.PizzaService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PizzaController {
	@Autowired
	private PizzaService service;
	
	@PostMapping("/pizzas")
    public Pizza adicionaPizza(Pizza pizza) {
        try {
            Pizza operacao = service.save(pizza);
            return operacao;
        } catch (Exception e) {
            throw e;
        }

    }
	
	@GetMapping("/pizzas")
    public List<Pizza> buscaTodasPizzas() {
        try {
            List<Pizza> operacao = service.findAll();
            return operacao;
        } catch (Exception e) {
            throw e;
        }

    }
}
