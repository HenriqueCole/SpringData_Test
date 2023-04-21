package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.ProdutoDTO;
import com.example.avaliacao_henrique.model.entity.Produto;
import com.example.avaliacao_henrique.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class ProdutoController {
    private ProdutoService produtoService;

    @PostMapping("/produto")
    public ResponseEntity<Object> save(@RequestBody @Valid ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produtoService.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping("/produto")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findById(id));
    }

    @PutMapping("/produto/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produto.setId(id);
        produtoService.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
