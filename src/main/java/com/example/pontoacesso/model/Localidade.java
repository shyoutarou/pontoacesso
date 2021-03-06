package com.example.pontoacesso.model;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private Long id;
    @ManyToOne //várias localidades tem um nível de acesso
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
