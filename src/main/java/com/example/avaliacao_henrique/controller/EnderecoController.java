package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.EnderecoDTO;
import com.example.avaliacao_henrique.model.entity.Endereco;
import com.example.avaliacao_henrique.service.EnderecoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class EnderecoController {
    private EnderecoService enderecoService;

    @PostMapping("/endereco")
    public ResponseEntity<Object> save(@RequestBody @Valid EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco();
        BeanUtils.copyProperties(enderecoDTO, endereco);
        enderecoService.save(endereco);
        return ResponseEntity.ok().body(endereco);
    }

    @GetMapping("/endereco")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(enderecoService.findAll());
    }

    @GetMapping("/endereco/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(enderecoService.findById(id));
    }

    @PutMapping("/endereco/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco();
        BeanUtils.copyProperties(enderecoDTO, endereco);
        endereco.setId(id);
        enderecoService.save(endereco);
        return ResponseEntity.ok().body(endereco);
    }

    @DeleteMapping("/endereco/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        enderecoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
