package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.Endereco;
import com.example.avaliacao_henrique.model.entity.Pedido;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class EnderecoEntregaDTO {
    private Long id;
    private Endereco endereco;
    private Pedido pedido;
}
