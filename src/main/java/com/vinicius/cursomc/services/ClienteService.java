package com.vinicius.cursomc.services;

import com.vinicius.cursomc.domain.Cliente;
import com.vinicius.cursomc.repositories.ClienteReposotory;
import com.vinicius.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteReposotory repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
