package com.campesinito.agricolasproductos.Dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDto {
    private Integer idUsuario;
    private String nombre;
    private String correo;
    private String rol;
    private boolean activo;

}
