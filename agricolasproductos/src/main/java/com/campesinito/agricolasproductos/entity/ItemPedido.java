package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items_pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad = 1;

    @Column(name = "precio_unitario", nullable = false)
    private Double precioUnitario = 0.0;

    @Column(nullable = false)
    private Double subtotal = 0.0;
}

