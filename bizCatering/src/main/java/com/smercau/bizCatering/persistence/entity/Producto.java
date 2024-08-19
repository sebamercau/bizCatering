package com.smercau.bizCatering.persistence.entity;

import lombok.Getter;
import lombok.Setter;

public class Producto {

    private long idProducto;

    private long codbar;

    private String nombreProducto;

    private String descripcionProducto;

    private String categoriaProducto;

    private double precioCosto;

    private double precioVenta;
}