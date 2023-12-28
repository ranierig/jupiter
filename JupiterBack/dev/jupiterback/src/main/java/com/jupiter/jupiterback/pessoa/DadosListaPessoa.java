package com.jupiter.jupiterback.pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosListaPessoa(
   //     @NotNull
        int id,
    //    @NotBlank
        String name,
        String email) {
    public DadosListaPessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getName(), pessoa.getEmail());
    }
}
