package com.ruanmanoel.financeapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String descricao;
    private Double valor;

    @Enumerated(EnumType.STRING)
    private TipoTransacao tipo;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
