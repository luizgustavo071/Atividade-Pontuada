package com.example.service;

import com.example.model.ProdutoModel;
import com.example.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel>listarTodos(){
        return repository.findAll();
    }
}
