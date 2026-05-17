package br.dev.quaresma.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "JOGOS")
public class Jogo extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String nome;

    public String plataforma;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public StatusJogo status;

    @Column(name = "ano_consumo")
    public Integer anoConsumo;

    public BigDecimal valor;

    public Integer nota;

    public String observacoes;

    @Column(name = "data_cadastro", nullable = false, updatable = false)
    public LocalDateTime dataCadastro = LocalDateTime.now();
}