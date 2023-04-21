package com.example.avaliacao_henrique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class ProdutoPedido {
    @Id
    @Column(name = "id_produto_pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "A quantidade deve ser maior que zero")
    @Column(name = "quantidade")
    private Integer quantidade;

    @JoinColumn(name = "produto_id")
    @ManyToOne
    private Produto produto;

    @JsonIgnore
    @JoinColumn(name = "pedido_id")
    @ManyToOne
    private Pedido pedido;
}
