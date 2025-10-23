package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nom_producto", nullable = false, length = 150)
    private String nomProducto;

    @Column(name = "tipo_producto", length = 100)
    private String tipoProducto;

    @Column(name = "precio", nullable = false, precision = 12, scale = 2)
    private BigDecimal precio;

    @Column(name = "stock", nullable = false)
    private Integer stock = 0;

    @Column(name = "descripcion", length = 2000)
    private String descripcion;

    @Column(name = "gramaje", length = 50)
    private String gramaje;

    // Si prefieres almacenar URL en vez de binario, cambia a String urlImagen
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    @Column(name = "creado_en", nullable = false)
    private java.time.LocalDateTime creadoEn = java.time.LocalDateTime.now();

    @Column(name = "actualizado_en")
    private java.time.LocalDateTime actualizadoEn;

    // Items de pedido que incluyen este producto (opcional, PRUDENTemente lazy)
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();
}
