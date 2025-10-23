package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Cliente cliente;

    @Column(name = "fecha_pedido", nullable = false)
    private LocalDateTime fechaPedido = LocalDateTime.now();

    @Column(name = "estado", nullable = false, length = 20)
    private String estado = "pendiente"; // 'pendiente','en proceso','entregado','cancelado'

    @Column(name = "precio_total", precision = 12, scale = 2, nullable = false)
    private BigDecimal precioTotal = BigDecimal.ZERO;

    @Column(name = "direccion_envio", length = 300)
    private String direccionEnvio;

    @Column(name = "observaciones", length = 2000)
    private String observaciones;

    @Column(name = "creado_en", nullable = false)
    private LocalDateTime creadoEn = LocalDateTime.now();

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<DetallePedido> items = new ArrayList<>();

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<Pago> pagos = new ArrayList<>();
}
