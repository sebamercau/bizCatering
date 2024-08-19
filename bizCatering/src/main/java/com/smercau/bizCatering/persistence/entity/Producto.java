package com.smercau.bizCatering.persistence.entity;

import lombok.Getter;
import lombok.Setter;

public class Producto {

    @Getter @Setter
    private long idProducto;

    @Getter @Setter
    private long codbar;

    @Getter @Setter
    private String nombreProducto;

    @Getter @Setter
    private String descripcionProducto;

    @Getter @Setter
    private String categoriaProducto;

    @Getter @Setter
    private double precioCosto;

    @Getter @Setter
    private double precioVenta;
}