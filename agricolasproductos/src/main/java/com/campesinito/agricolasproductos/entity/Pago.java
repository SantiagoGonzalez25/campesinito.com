package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer idPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Pedido pedido;

    @Column(name = "metodo_pago", nullable = false, length = 20)
    private String metodoPago; // 'Efectivo','Transferencia','Tarjeta'

    @Column(name = "monto_pagado", precision = 12, scale = 2, nullable = false)
    private BigDecimal montoPagado;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDateTime fechaPago = LocalDateTime.now();

    @Column(name = "estado_pago", nullable = false, length = 20)
    private String estadoPago = "Pendiente"; // 'Pendiente','Aprobado','Rechazado'

    @Column(name = "referencia", length = 200)
    private String referencia;

    // comprobante binario opcional (o podrías guardar URL)
    @Lob
    @Column(name = "comprobante")
    private byte[] comprobante;

    @Column(name = "creado_en", nullable = false)
    private LocalDateTime creadoEn = LocalDateTime.now();
}
