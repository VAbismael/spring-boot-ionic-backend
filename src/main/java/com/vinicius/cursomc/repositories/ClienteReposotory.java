package com.vinicius.cursomc.repositories;

import com.vinicius.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClienteReposotory extends JpaRepository<Cliente, Integer> {

    @Transactional
    Cliente findByEmail(String email);
}
