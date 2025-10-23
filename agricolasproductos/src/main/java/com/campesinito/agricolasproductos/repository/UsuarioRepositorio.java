package com.campesinito.agricolasproductos.repository;


import com.campesinito.agricolasproductos.entity.Usuario;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByCorreo(String correo);
    boolean existeBycorreo(String correo);

}
