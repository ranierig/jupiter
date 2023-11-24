package com.jupiter.jupiterback.pessoa;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_pessoa")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private Boolean activate;

    public Pessoa(DadosCadastros dadosCadastros) {
        this.name = dadosCadastros.name();
        this.email = dadosCadastros.email();
        this.activate = dadosCadastros.activate();
    }

    public void atualizarInformacoes(DadosAtualizacao dados) {
        if (dados.name() != null) this.name = dados.name();
        if (dados.email() != null) this.email = dados.email();
    }
}
