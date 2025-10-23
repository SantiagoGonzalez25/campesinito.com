package com.campesinito.agricolasproductos.Dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CrearClientePeticion {
    private Integer idUsuario;
    private String nombre;
    private String contacto;
    private String direccion;
    private String ciudad;
    private String tipoCliente;

}
