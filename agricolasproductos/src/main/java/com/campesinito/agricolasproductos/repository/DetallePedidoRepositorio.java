package com.campesinito.agricolasproductos.repository;

import com.campesinito.agricolasproductos.entity.DetallePedido;
import com.campesinito.agricolasproductos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido, Integer> {
    List<DetallePedido> findByPedido(Pedido pedido);
}
