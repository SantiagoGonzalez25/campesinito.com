package com.campesinito.agricolasproductos.repository;

import com.campesinito.agricolasproductos.entity.Pago;
import com.campesinito.agricolasproductos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PagoRepositorio extends JpaRepository<Pago, Integer> {
    List<Pago> findByPedido(Pedido pedido);
    List<Pago> findByFechaPagoBetween(LocalDateTime desde, LocalDateTime hasta);
}
