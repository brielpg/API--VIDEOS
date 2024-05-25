package br.com.apivideos.Videos;

import jakarta.validation.constraints.NotNull;

public record DadosUpdateVideo(@NotNull Long id,
                               String titulo,
                               String descricao) {
}
