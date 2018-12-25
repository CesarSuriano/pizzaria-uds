package com.example.pizzaria.repository;

import org.springframework.stereotype.Repository;

import com.example.pizzaria.model.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
