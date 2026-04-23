package com.example.controller;

import com.example.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.service.ClienteService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class ClienteController  {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> litar() {
        return service.listarTodos();
    }
    @PostMapping
    public ResponseEntity<Map<String, String>>salvar(@RequestBody ClienteModel cliente) {
        service.salvarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "Mensagem",
                "Cliente cadastrado com sucesso!"
        ));
    }

}
