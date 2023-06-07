package com.example.demo.domain.model;

/**
 * Enum, pode ser criado com parâmetros como abaixo, ou apenas com nome da variável, sem outras inforamções.
 */
public enum DemoEnum {

    EXEMPLO("Exemplo");

    private final String name;

    public String getName() {
        return name;
    }

    DemoEnum(String name) {
        this.name = name;
    }
}
