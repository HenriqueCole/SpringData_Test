package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.Fornecedor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private List<Fornecedor> fornecedores;
}
