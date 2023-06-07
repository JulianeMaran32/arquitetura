package com.example.demo.service;

import com.example.demo.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe responsável pela lógica, tratamento de exceções,validações etc.
 * Pode encontrar classes Services com anotação @Component
 */
@Service
public class DemoService {

    private final DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public String listDemo() {
        return "Listar";
    }

    public String findById() {
        return "buscar por id";
    }

    public String saveDemo() {
        return "salvar dados";
    }

    public String deleteDemo() {
        return "excluir dados";
    }

}
