package com.example.avaliacao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Cliente {
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cliente", length = 100)
    private String nome;

    @Column(name = "email_cliente", length = 100)
    private String email;

    @Column(name = "telefone_cliente", length = 100)
    private String telefone;

    @Column(name = "id_endereco")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    @JoinColumn(name = "id_cartao_credito")
    @OneToOne(cascade = CascadeType.ALL)
    private CartaoCredito cartao;
}
