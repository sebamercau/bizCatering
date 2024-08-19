package com.smercau.bizCatering.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "empleadoEntity")
@Getter
@Setter
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false)
    private long idEmpleado;

    @Column(name = "legajo", nullable = false)
    private long legajo;

    @Column(name = "tarjeta_magnetica")
    private long tarjetaMagnetica;

    @Column(name = "nombre", nullable = false,length = 30)
    private String nombre;

    @Column(name = "apellido", nullable = false,length = 50)
    private String apellido;

    @Column(name = "dni",length = 8)
    private int dni;

}