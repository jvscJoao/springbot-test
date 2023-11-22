package com.example.test.springboot.test_springboot.model.repositories;

import org.springframework.data.repository.Repository;

import com.example.test.springboot.test_springboot.model.entities.Cliente;

public interface ClienteRepository extends Repository<Cliente, Integer> {
    
}