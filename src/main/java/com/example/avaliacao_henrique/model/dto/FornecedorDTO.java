package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.Cliente;
import com.example.avaliacao_henrique.model.entity.Produto;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
public class FornecedorDTO {
    private Long id;
    private String nome;
    private String cnpj;
    private List<Produto> produtos;
    private List<Cliente> clientes;
}
