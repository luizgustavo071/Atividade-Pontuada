package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class ClienteModel {
    @Id
    private String nome;
    private String email;
    private String telefone;
    private String formaPagamento;
    private String endereco;

    public ClienteModel() {
    }

    public ClienteModel(String nome, String email, String telefone, String formaPagamento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.formaPagamento = formaPagamento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
