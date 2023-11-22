package com.example.test.springboot.test_springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.springboot.test_springboot.model.entities.Cliente;
import com.example.test.springboot.test_springboot.model.repositories.ClienteRepository;

@RestController
/*
 * Marca a classe como um controlador REST, onde os métodos geralmente retornam dados diretamente
 * no corpo da resposta HTTP
*/
@RequestMapping(path="/cliente")
/*
 * É usada para mapear as soliticações HTTP, pode ser usada tanto na classe como em métodos especificos.
 * é possivel adiciona mais de 1 method ao request, só definir entre {}
*/
public class ClienteController {

    @Autowired
    /*
     * Realiza a injeção de dependência
    */
    private ClienteRepository clienteRepository;

    /*
     * GetMapping: Quase mesma função do RequestMapping, porém, já tem um método HTTP embutido(GET)
     * Iterable: Interface usava para adicionar entidades e facilmente percorrer.
    */
    @GetMapping
    public Iterable<Cliente> mostrarClientes() {
        return clienteRepository.findAll();
    }
}