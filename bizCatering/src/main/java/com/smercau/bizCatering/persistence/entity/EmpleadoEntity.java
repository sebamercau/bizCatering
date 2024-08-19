package com.smercau.bizCatering.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "empleado")
public class EmpleadoEntity {

    @Getter @Setter
    private long idEmpleado;

    @Getter @Setter
    private long legajo;

    @Getter @Setter
    private long tarjetaMagnetica;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private int dni;




}
