package com.campesinito.agricolasproductos.Dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrarPagoPeticion {
    private Integer idPedido;
    private String metodoPago;
    private BigDecimal montoPagado;
    private String referencia;
   
}
