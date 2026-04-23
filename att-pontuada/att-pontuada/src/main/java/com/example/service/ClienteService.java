package com.example.service;

import com.example.model.ClienteModel;
import com.example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    public List<ClienteModel> listarTodos() {
        return repository.findAll();
    }

    public ClienteModel salvarCliente(ClienteModel cliente) {
        //Verificar se o cliente não está cadastrado no banco de dados,
        //antes de salvar.
        if (repository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado.");

        }
        return repository.save(cliente);
    }
}
