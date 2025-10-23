package com.campesinito.agricolasproductos.Dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteDto {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombre;
    private String contacto;
    private String direccion;
    private String ciudad;
    private String tipoCliente;

}
