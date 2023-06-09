package com.example.demo.repositories;

import com.example.demo.domain.model.DemoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface responsável por ditar as regras da conexão com o banco de dados
 */
@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long> {
}
