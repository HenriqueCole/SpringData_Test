package com.example.avaliacao_henrique.controller;

import com.example.avaliacao_henrique.model.dto.PedidoDTO;
import com.example.avaliacao_henrique.model.entity.Pedido;
import com.example.avaliacao_henrique.service.PedidoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/prova")
public class PedidoController {
    private PedidoService pedidoService;


    @PostMapping("/pedido")
    public ResponseEntity<Object> save(@RequestBody @Valid PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        BeanUtils.copyProperties(pedidoDTO, pedido);
        pedidoService.save(pedido);
        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping("/pedido")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok(pedidoService.findAll());
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.findById(id));
    }

    @PutMapping("/pedido/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody @Valid PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        BeanUtils.copyProperties(pedidoDTO, pedido);
        pedido.setId(id);
        pedidoService.save(pedido);
        return ResponseEntity.ok().body(pedido);
    }

    @DeleteMapping("/pedido/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {
        pedidoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
