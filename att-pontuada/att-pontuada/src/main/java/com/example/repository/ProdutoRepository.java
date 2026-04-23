package com.example.repository;

import com.example.model.FuncionarioModel;
import com.example.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    Optional<ProdutoModel>findByLote(String lote);
}
