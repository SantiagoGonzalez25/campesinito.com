package com.campesinito.agricolasproductos.Dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoDto {
    private Integer idPago;
    private Integer idPedido;
    private String metodoPago;
    private BigDecimal montoPagado;
    private LocalDateTime fechaPago;
    private String estadoPago;
    private String referencia;
}

