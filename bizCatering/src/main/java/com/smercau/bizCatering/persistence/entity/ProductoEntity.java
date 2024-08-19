package com.smercau.bizCatering.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DecimalFormat;

@Entity
@Table(name="productoEntity")
@Getter
@Setter
@NoArgsConstructor
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private long idProducto;

    @Column(name = "codbar",length = 30)
    private long codbar;

    @Column(name = "nombreProducto",length = 60)
    private String nombreProducto;

    @Column(name = "descripcionProducto",length = 200)
    private String descripcionProducto;

    @Column(name = "categoriaProducto",length = 80)
    private String categoriaProducto;

    @Column(name = "precioCosto",nullable = false,columnDefinition = "Decimal(5,2)")
    private double precioCosto;

    @Column(name = "precioVenta",nullable = false, columnDefinition = "Decimal(5,2)")
    private double precioVenta;
}