package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Detalle_pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer idDetalle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Producto producto;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad = 1;

    @Column(name = "precio_unitario", nullable = false, precision = 12, scale = 2)
    private BigDecimal precioUnitario = BigDecimal.ZERO;

    // columna computada en la DB: subtotal AS(cantidad * precio_unitario) PERSISTED
    @Column(name = "subtotal", insertable = false, updatable = false)
    private BigDecimal subtotal;
}
