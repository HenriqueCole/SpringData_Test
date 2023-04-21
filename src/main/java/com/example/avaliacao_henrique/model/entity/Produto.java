package com.example.avaliacao_henrique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
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
public class Produto {
    @Id
    @Column(name = "id_produto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto", length = 100)
    private String nome;

    @Min(value = 1, message = "O preço deve ser maior ou igual a zero")
    @Column(name = "preco_produto")
    private Double preco;

    @Positive(message = "A quantidade deve ser maior que zero")
    @Column(name = "quantidade_produto")
    private Integer quantidade;

    @JsonIgnore
    @Column(name = "id_fornecedor")
    @ManyToMany(mappedBy = "produtos", cascade = CascadeType.ALL)
    private List<Fornecedor> fornecedores;
}
