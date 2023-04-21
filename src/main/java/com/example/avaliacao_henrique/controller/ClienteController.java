package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.ClienteDTO;
import com.example.avaliacao_henrique.model.entity.Cliente;
import com.example.avaliacao_henrique.service.ClienteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class ClienteController {
    private ClienteService clienteService;

    @PostMapping("/cliente")
    public ResponseEntity<Object> save(@RequestBody @Valid ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        clienteService.save(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @GetMapping("/cliente")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO, cliente);
        cliente.setId(id);
        clienteService.save(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
