package com.alura.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id,
                                    @NotNull String titulo,
                                    @NotNull String mensaje,
                                    @NotNull Long autor,
                                    @NotNull Long idCurso) {

}
