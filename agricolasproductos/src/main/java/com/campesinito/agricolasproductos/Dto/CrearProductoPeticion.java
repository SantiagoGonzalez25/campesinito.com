package com.campesinito.agricolasproductos.Dto;


import lombok.*;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrearProductoPeticion {
    private String nomProducto;
    private String tipoProducto;
    private BigDecimal precio;
    private Integer stock;
    private String descripcion;
    private String gramaje;

}
