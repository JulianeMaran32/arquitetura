package com.example.demo.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

/**
 * Classe model, responsável por conter dados modelo de uma aplicação
 * Por exemplo, utilizado em API REST que NÃO possui conexão com banco de dados
 */
@Table(name = "user")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DemoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;

    @CPF(message = "${demo.cpf.valid}")
    @Column(unique = true)
    private String cpf;

}
