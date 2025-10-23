package com.campesinito.agricolasproductos.repository;

import com.campesinito.agricolasproductos.entity.Pedido;
import com.campesinito.agricolasproductos.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
    List<Pedido> findByFechaPedidoBetween(LocalDateTime desde, LocalDateTime hasta);
}
