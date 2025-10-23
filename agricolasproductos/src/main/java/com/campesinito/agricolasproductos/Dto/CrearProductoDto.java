package com.campesinito.agricolasproductos.Dto;
import lombok.*;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

public class CrearProductoDto {

    private String nombre;
    private String tipo;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String gramaje;
    private Boolean activo;



}
