package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.ProdutoPedidoDTO;
import com.example.avaliacao_henrique.model.entity.ProdutoPedido;
import com.example.avaliacao_henrique.service.ProdutoPedidoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class ProdutoPedidoController {
    private ProdutoPedidoService produtoPedidoService;

    @PostMapping("/produtopedido")
    public ResponseEntity<Object> save(@RequestBody @Valid ProdutoPedidoDTO produtoPedidoDTO) {
        ProdutoPedido produtoPedido = new ProdutoPedido();
        BeanUtils.copyProperties(produtoPedidoDTO, produtoPedido);
        produtoPedidoService.save(produtoPedido);
        return ResponseEntity.ok().body(produtoPedido);
    }

    @GetMapping("/produtopedido")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(produtoPedidoService.findAll());
    }

    @GetMapping("/produtopedido/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoPedidoService.findById(id));
    }

    @PutMapping("/produtopedido/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid ProdutoPedidoDTO produtoPedidoDTO) {
        ProdutoPedido produtoPedido = new ProdutoPedido();
        BeanUtils.copyProperties(produtoPedidoDTO, produtoPedido);
        produtoPedido.setId(id);
        produtoPedidoService.save(produtoPedido);
        return ResponseEntity.ok().body(produtoPedido);
    }

    @DeleteMapping("/produtopedido/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        produtoPedidoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
