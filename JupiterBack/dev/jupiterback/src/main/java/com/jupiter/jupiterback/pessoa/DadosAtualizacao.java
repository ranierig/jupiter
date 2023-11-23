package com.jupiter.jupiterback.pessoa;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacao(
        @NotNull
        int id, String name, String email) {

}
