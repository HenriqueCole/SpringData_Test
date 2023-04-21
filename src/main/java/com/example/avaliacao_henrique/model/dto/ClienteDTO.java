package com.example.avaliacao_henrique.model.dto;

import com.example.avaliacao_henrique.model.entity.CartaoCredito;
import com.example.avaliacao_henrique.model.entity.Endereco;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    @Email
    private String email;
    private String telefone;
    private List<Endereco> enderecos;
    private CartaoCredito cartao;
}
