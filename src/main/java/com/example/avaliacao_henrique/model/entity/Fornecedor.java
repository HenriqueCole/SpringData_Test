package com.example.avaliacao_henrique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Fornecedor {
    @Id
    @Column(name = "id_fornecedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_fornecedor", length = 100)
    private String nome;

    @Column(name = "cnpj_fornecedor", length = 100)
    private String cnpj;

    @JoinColumn(name = "lista_de_produtos")
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    @Column(name = "lista_de_clientes")
    @ManyToMany
    @JsonIgnore
    private List<Cliente> clientes;
}

