package com.example.pontoacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
// Se colocado a anotação Audit, tem que colocar em todas
// classes que tiverem relação
//@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Audited
    private String descricao;

    public JornadaTrabalho(String descricao) {
        this.descricao = descricao;
    }

    public void PrintDescricao()
    {
        System.out.println("Descrição: " + this.descricao);
    }
}
