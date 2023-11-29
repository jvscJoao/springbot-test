package com.example.test.springboot.test_springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
     * GetMapping: Quase mesma função do RequestMapping, porém, já tem um método HTTP embutido(GET - Listar)
     * Iterable: Interface usava para adicionar entidades e facilmente percorrer.
    */
    @GetMapping
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }
    /*
     * PostMapping: Quase mesma função do RequestMapping, porém, já tem um método HTTP embutido(POST - Adicionar)
     * @ResponseBody: Interface usava para adicionar entidades e facilmente percorrer.
    */
    @PostMapping
    public @ResponseBody Cliente create(Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    /*
     * GetMapping: Adicionei um caminho na URL onde depois da / e é passado o ID do cliente.
     * PathVariable: Útil quando valores necessários estão incorporados diretamente na estrutura do caminho URL.
     * RequestParam: Útil para parâmetros de consulta opcionais ou adicionais em uma URL.
    */
    @GetMapping("/{id}")
    public ResponseEntity<?> readById(@PathVariable int id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);

        if (cliente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado com ID: " + id);
        } else {
            return ResponseEntity.ok(cliente);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        clienteRepository.deleteById(id);
    }
}