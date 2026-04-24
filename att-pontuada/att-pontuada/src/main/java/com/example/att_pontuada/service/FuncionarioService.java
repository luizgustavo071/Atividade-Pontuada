package com.example.att_pontuada.service;

import com.example.att_pontuada.model.FuncionarioModel;
import com.example.att_pontuada.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel>listarTodos(){
        return repository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionario já cadastrado.");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não encontrado.");
        }
        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não encontrado.");
        }
        repository.deleteById(id);
    }
}
