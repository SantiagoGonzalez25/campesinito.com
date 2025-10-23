package com.campesinito.agricolasproductos.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CrearUsuarioPeticion {

    private String nombre;
    private String correo;
    private String contrasena;
    private String rol;

}
