package com.example.demo.controller;

import com.example.demo.domain.model.DemoModel;
import com.example.demo.service.DemoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Classe rsponsável pela requisição da aplicação
 * NÃO há tratamento de exceções e nem lógica > é responsabilidade do service
 */
@RestController
@RequestMapping
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping
    public String createdDemo(DemoModel demoModel) {
        return "POST > Create";
    }

    @GetMapping
    public String getAllDemo() {
        return "Get > Read";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return "Get > Read";
    }

    @PutMapping("/{id}")
    public String updateDemo(@PathVariable Long id, DemoModel demoModel) {
        return "PUT > Update";
    }

    @PatchMapping("/{id}")
    public String partialUpdateDemo(@PathVariable Long id, DemoModel demoModel) {
        return "PATCH > Update";
    }

    @DeleteMapping("/{id}")
    public String deleteDemo(@PathVariable Long id) {
        return "DELETE > Delete";
    }

}