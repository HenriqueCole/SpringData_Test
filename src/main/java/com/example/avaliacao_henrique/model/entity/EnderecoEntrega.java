package com.example.avaliacao_henrique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class EnderecoEntrega {
    @Id
    @Column(name = "id_endereco_entrega")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "rua")
    @OneToOne
    private Endereco endereco;

    @JsonIgnore
    @JoinColumn(name = "numero")
    @OneToOne(mappedBy = "endereco")
    private Pedido pedido;

}
