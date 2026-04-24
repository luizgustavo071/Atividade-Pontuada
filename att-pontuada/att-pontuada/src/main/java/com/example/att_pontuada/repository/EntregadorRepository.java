package com.example.att_pontuada.repository;

import com.example.att_pontuada.model.EntregadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Long> {
    Optional<EntregadorModel>findByEmail(String email);
}
