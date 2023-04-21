package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.Pedido;
import com.example.avaliacao_henrique.model.entity.Produto;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class ProdutoPedidoDTO {
    private Long id;
    private Integer quantidade;
    private Produto produto;
    private Pedido pedido;
}
