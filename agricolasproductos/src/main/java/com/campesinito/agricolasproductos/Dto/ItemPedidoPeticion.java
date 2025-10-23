package com.campesinito.agricolasproductos.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemPedidoPeticion {
    private Integer idProducto;
    private Integer cantidad;
}

