package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.FornecedorDTO;
import com.example.avaliacao_henrique.model.entity.Fornecedor;
import com.example.avaliacao_henrique.service.FornecedorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class FornecedorController {
    private FornecedorService fornecedorService;

    @PostMapping("/fornecedor")
    public ResponseEntity<Object> save(@RequestBody @Valid FornecedorDTO fornecedorDTO) {
        Fornecedor fornecedor = new Fornecedor();
        BeanUtils.copyProperties(fornecedorDTO, fornecedor);
        fornecedorService.save(fornecedor);
        return ResponseEntity.ok().body(fornecedor);
    }

    @GetMapping("/fornecedor")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(fornecedorService.findAll());
    }

    @GetMapping("/fornecedor/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(fornecedorService.findById(id));
    }

    @PutMapping("/fornecedor/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid FornecedorDTO fornecedorDTO) {
        Fornecedor fornecedor = new Fornecedor();
        BeanUtils.copyProperties(fornecedorDTO, fornecedor);
        fornecedor.setId(id);
        fornecedorService.save(fornecedor);
        return ResponseEntity.ok().body(fornecedor);
    }

    @DeleteMapping("/fornecedor/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        fornecedorService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
