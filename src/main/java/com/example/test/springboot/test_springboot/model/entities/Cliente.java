package com.example.test.springboot.test_springboot.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // é usada para indicar que a classe é uma entidade JPA, mapeada para uma tabela no banco de dados.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
//Getter, Setter, AllArgsConstructor, NoArgsConstructor, EqualsAndHashCode: gera automaticamente os métodos

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nome;
    @NotBlank
    @Column(unique = true)
    private String cpf;

}

/*
    * Id: Identificar chave primária para uma tabela do banco de dados
    * GeneratedValue: Define como as chaves primárias devem ser geradas
        * GenerationType.AUTO: JPA escolhe automaticamente a estratégia apropriada.
        * GenerationType.IDENTITY: Autoincremento no banco de dados.
        * GenerationType.SEQUENCE: Gerador de sequência no BD.
        * GenerationType.TABLE: Usa uma tabela de BD para gerar chaves.
    *
    * NotBlank: variável não pode ser vazio
    * Column - unique: valor unico na tabela
*/
