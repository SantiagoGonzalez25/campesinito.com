package com.campesinito.agricolasproductos.Dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrearPedidoPeticion {
    private Integer idCliente;
    private String direccionEnvio;
    private String observaciones;
    private List<ItemPedidoPeticion> items;
}
