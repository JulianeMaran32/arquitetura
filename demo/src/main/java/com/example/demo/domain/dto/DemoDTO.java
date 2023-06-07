package com.example.demo.domain.dto;

/**
 * Classe DTO é aque contém atributos/variáveis para o corpo de uma requisição,
 * por exemplo: formulário de cadastro do usuário
 */
public class DemoDTO {

    private String nome;

    public DemoDTO() {
    }

    public DemoDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
