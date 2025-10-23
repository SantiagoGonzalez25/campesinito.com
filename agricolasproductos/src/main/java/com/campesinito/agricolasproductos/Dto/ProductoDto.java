package com.campesinito.agricolasproductos.Dto;

import java.math.BigDecimal;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductoDto {

    private Integer idProducto;
    private String nomProducto;
    private String tipoProducto;
    private BigDecimal precio;
    private Integer Stock;
    private String descripcion;
    private String gramaje;
    private Boolean activo;

}
