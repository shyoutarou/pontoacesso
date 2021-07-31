package com.example.pontoacesso.model;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;
    @ManyToOne //vários usuários para 1 categoria
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne //vários usuários em 1 empresa
    private Empresa empresa;
    @ManyToOne //vários usuários em 1 nível de acesso
    private NivelDeAcesso nivelDeAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;

    //Flot e Double no Java pode ter inconsistências
    private BigDecimal tolerancia;
    private LocalDateTime inicioDaJornada;
    private LocalDateTime finalDaJornada;
}
