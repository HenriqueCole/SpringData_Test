package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.EnderecoEntregaDTO;
import com.example.avaliacao_henrique.model.entity.EnderecoEntrega;
import com.example.avaliacao_henrique.service.EnderecoEntregaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class EnderecoEntregaController {
    private EnderecoEntregaService enderecoEntregaService;

    @PostMapping("/enderecoentrega")
    public ResponseEntity<Object> save(@RequestBody @Valid EnderecoEntregaDTO enderecoEntregaDTO) {
        EnderecoEntrega enderecoEntrega = new EnderecoEntrega();
        BeanUtils.copyProperties(enderecoEntregaDTO, enderecoEntrega);
        enderecoEntregaService.save(enderecoEntrega);
        return ResponseEntity.ok().body(enderecoEntrega);
    }

    @GetMapping("/enderecoentrega")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(enderecoEntregaService.findAll());
    }

    @GetMapping("/enderecoentrega/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(enderecoEntregaService.findById(id));
    }

    @PutMapping("/enderecoentrega/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid EnderecoEntregaDTO enderecoEntregaDTO) {
        EnderecoEntrega enderecoEntrega = new EnderecoEntrega();
        BeanUtils.copyProperties(enderecoEntregaDTO, enderecoEntrega);
        enderecoEntrega.setId(id);
        enderecoEntregaService.save(enderecoEntrega);
        return ResponseEntity.ok().body(enderecoEntrega);
    }

    @DeleteMapping("/enderecoentrega/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        enderecoEntregaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
