package com.example.pontoacesso.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoDeHoras {
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class BancoDeHorasId implements Serializable {
        private long idBancoDeHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoDeHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
