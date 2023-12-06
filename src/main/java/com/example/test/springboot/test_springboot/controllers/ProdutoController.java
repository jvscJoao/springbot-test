package com.example.test.springboot.test_springboot.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.test.springboot.test_springboot.model.entities.Produto;
import com.example.test.springboot.test_springboot.model.repositories.ProdutoRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping()
    public ResponseEntity<List<Produto>> read() {
        List<Produto> produtos = produtoRepository.findAll();
        return ResponseEntity.ok().body(produtos);
    }
    
    
}
