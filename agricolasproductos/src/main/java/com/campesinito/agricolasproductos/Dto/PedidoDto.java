package com.campesinito.agricolasproductos.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.swing.event.InternalFrameEvent;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PedidoDto {
    private Integer idPedido;
    private Integer idCliente;
   private LocalDate fechaPedido;
    private String estado;
    private BigDecimal precioTotal;
    private String direccionEnvio;
    private String observaciones;
    private List<itemPedidoDto> items;
}





//XDXDXDXDXD no funciona
