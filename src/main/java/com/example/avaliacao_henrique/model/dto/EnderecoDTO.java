package com.example.avaliacao_henrique.model.dto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class EnderecoDTO {
    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
