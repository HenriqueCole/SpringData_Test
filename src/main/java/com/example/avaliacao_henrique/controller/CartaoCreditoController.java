package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.CartaoCreditoCTO;
import com.example.avaliacao_henrique.model.entity.CartaoCredito;
import com.example.avaliacao_henrique.service.CartaoCreditoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class CartaoCreditoController {
    private CartaoCreditoService cartaoCreditoService;

    @PostMapping("/cartaocredito")
    public ResponseEntity<Object> save(@RequestBody @Valid CartaoCreditoCTO cartaoCreditoDTO) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        BeanUtils.copyProperties(cartaoCreditoDTO, cartaoCredito);
        cartaoCreditoService.save(cartaoCredito);
        return ResponseEntity.ok().body(cartaoCredito);
    }

    @GetMapping("/cartaocredito")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(cartaoCreditoService.findAll());
    }

    @GetMapping("/cartaocredito/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(cartaoCreditoService.findById(id));
    }

    @PutMapping("/cartaocredito/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid CartaoCreditoCTO cartaoCreditoDTO) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        BeanUtils.copyProperties(cartaoCreditoDTO, cartaoCredito);
        cartaoCredito.setId(id);
        cartaoCreditoService.save(cartaoCredito);
        return ResponseEntity.ok().body(cartaoCredito);
    }

    @DeleteMapping("/cartaocredito/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        cartaoCreditoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
