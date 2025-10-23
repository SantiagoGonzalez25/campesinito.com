package com.campesinito.agricolasproductos.repository;

import com.campesinito.agricolasproductos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    List<Producto> findByNomProductoContainingIgnoreCase(String nombre);
    List<Producto> findByTipoProducto(String tipo);
    List<Producto> findByActivoTrue();
}
