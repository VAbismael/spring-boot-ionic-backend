package com.vinicius.cursomc.repositories;

import com.vinicius.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteReposotory extends JpaRepository<Cliente, Integer> {
}
