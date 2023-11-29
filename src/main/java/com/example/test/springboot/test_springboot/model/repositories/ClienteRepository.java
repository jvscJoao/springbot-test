package com.example.test.springboot.test_springboot.model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.springboot.test_springboot.model.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    /*
     * Repository: É usado para armazenamento de dados, no caso estou armazenando Cliente(s)
     * CrudRepository: Interface que fornece métodos para realizar operações CRUD (Create, Read, Update, Delete)
     * Primeiro parâmetro: Entidade/Classe fornecisa
     * Segundo parâmetro: Tipo do identificador da entidade, no caso Integer
     */

    /*
     * Query Creation
     * É usado para criar consultas no BD usando nomeclatura nos métodos
     * Documentação: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
     */

    //Procurar por Clientes com nome parecido passado no parâmetro
    public Optional<List<Cliente>> findByNomeLikeOrderByNome(String nome);
}