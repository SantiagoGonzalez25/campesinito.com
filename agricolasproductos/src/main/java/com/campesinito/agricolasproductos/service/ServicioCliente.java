package com.campesinito.agricolasproductos.service;

import com.campesinito.agricolasproductos.Dto.ClienteDto;
import com.campesinito.agricolasproductos.Dto.CrearClientePeticion;
import com.campesinito.agricolasproductos.entity.Cliente;
import com.campesinito.agricolasproductos.repository.ClienteRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional

public class ServicioCliente {

    private final ClienteRepositorio clienteRepositorio;

    public ServicioCliente(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio = clienteRepositorio;
    }

    public List<ClienteDto> listarTodosClientes(){
        List<Cliente> lista = clienteRepositorio.findAll();
        List<ClienteDto> salida = new ArrayList<>();

        for (Cliente c :lista){
            ClienteDto dto = new ClienteDto();
            dto.setIdCliente(c.getIdCliente());
            dto.setIdUsuario(c.getUsuario() != null ? c.getUsuario().getIdUsuario() : null);
            dto.setNombre(c.getNombre());
            dto.setContacto(c.getContacto());
            dto.setDireccion(c.getDireccion());
            dto.setCiudad(c.getCiudad());
            dto.setTipoCliente(c.getTipoCliente());
            salida.add(dto);

        }

        return salida;
    }

    public ClienteDto crear(CrearClientePeticion peticion) {
        Cliente c = new Cliente();
        c.setNombre(peticion.getNombre());
        c.setContacto(peticion.getContacto());
        c.setDireccion(peticion.getDireccion());
        c.setCiudad(peticion.getCiudad());
        c.setTipoCliente(peticion.getTipoCliente());

        Cliente guardado = clienteRepositorio.save(c);

        ClienteDto dto = new ClienteDto();
        dto.setIdCliente(guardado.getIdCliente());
        dto.setNombre(guardado.getNombre());
        dto.setContacto(guardado.getContacto());
        dto.setDireccion(guardado.getDireccion());
        dto.setCiudad(guardado.getCiudad());
        dto.setTipoCliente(guardado.getTipoCliente());
        return dto;
    }


    public ClienteDto actualizar(Integer id, CrearClientePeticion peticion){
        Cliente c = clienteRepositorio.FindById(id). orElsethrow(());

    }
}