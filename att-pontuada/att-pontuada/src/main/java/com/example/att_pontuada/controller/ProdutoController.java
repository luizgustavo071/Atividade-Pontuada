package com.example.att_pontuada.controller;

import com.example.att_pontuada.model.ProdutoModel;
import com.example.att_pontuada.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired

    private ProdutoService service;
    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ProdutoModel produto){
        service.salvar(produto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Produto salvo com sucesso."));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @RequestBody ProdutoModel produto){
        service.atualizarProduto(id,produto);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Produto atualizado com sucesso."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(
            @PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of(
                        "mensagem",
                        "Produto deletado com sucesso."));
    }
}
