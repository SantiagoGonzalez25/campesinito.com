package com.campesinito.agricolasproductos.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Usuario usuario;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "contacto", length = 50)
    private String contacto;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "ciudad", length = 100)
    private String ciudad;

    @Column(name = "tipo_cliente", length = 50)
    private String tipoCliente; 

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();
}
