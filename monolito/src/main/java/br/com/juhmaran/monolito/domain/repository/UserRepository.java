package br.com.juhmaran.monolito.domain.repository;

import br.com.juhmaran.monolito.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
