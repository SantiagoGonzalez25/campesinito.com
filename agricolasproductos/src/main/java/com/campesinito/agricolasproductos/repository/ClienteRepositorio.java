package com.campesinito.agricolasproductos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campesinito.agricolasproductos.entity.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);

}
