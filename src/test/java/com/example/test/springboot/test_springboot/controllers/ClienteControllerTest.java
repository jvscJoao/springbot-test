package com.example.test.springboot.test_springboot.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.test.springboot.test_springboot.model.entities.Cliente;
import com.example.test.springboot.test_springboot.model.repositories.ClienteRepository;

@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {
    /*
        Instâncias de classe teste 
    */
    @InjectMocks
    private ClienteController clienteController;
    /*
        Mocks são objetos simulados usados para testes.
    */
    @Mock
    private ClienteRepository clienteRepository;

    private Cliente cliente;

    /*
        Antes de cada inicialização, esse método será executado
    */
    @BeforeEach
    void setup() {
        cliente = new Cliente(1, "R9", "99009900"); 
    }

    /*
        Anotação que indica que o método decorado é um método de teste
    */
    @Test
    public void adicionandoUmNovoCliente() {
        clienteController.salvarCliente(cliente);
    }
}
