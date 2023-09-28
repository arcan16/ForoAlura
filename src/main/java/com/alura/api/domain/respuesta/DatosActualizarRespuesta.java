package com.alura.api.domain.respuesta;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id,
                                       @NotNull String mensaje,
                                       @NotNull Long idTopico,
                                       @NotNull Long idUsuario) {
}
