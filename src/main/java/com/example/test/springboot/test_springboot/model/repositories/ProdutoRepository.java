package com.example.test.springboot.test_springboot.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.springboot.test_springboot.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{}