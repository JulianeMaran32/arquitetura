package com.example.demo.domain.model;

/**
 * Classe model, responsável por conter dados modelo de uma aplicação
 * Por exemplo, utilizado em API REST que NÃO possui conexão com banco de dados
 */
public class DemoModel {

    private Integer id;
    private String nome;

    public DemoModel() {
    }

    public DemoModel(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
