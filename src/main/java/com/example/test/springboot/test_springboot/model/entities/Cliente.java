package com.example.test.springboot.test_springboot.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Usada para facilitar mapeamento da classe para o Banco de Dados
public class Cliente {
    
    @Id // Identificar chave primária para uma tabela do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
     * Define como as chaves primárias devem ser geradas
     * GenerationType.AUTO: JPA escolhe automaticamente a estratégia apropriada.
     * GenerationType.IDENTITY: Autoincremento no banco de dados.
     * GenerationType.SEQUENCE: Gerador de sequência no BD.
     * GenerationType.TABLE: Usa uma tabela de BD para gerar chaves.
     */
    private int id;
    private String nome;
    private String cpf;

    Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
