package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.Cliente;
import com.example.avaliacao_henrique.model.entity.EnderecoEntrega;
import com.example.avaliacao_henrique.model.entity.ProdutoPedido;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
public class PedidoDTO {
    private Long id;
    private Double valorTotal;
    private List<ProdutoPedido> produtos;
    private Cliente cliente;
    private EnderecoEntrega endereco;
}
