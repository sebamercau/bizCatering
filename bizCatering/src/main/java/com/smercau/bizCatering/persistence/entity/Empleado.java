package com.smercau.bizCatering.persistence.entity;

import lombok.Getter;
import lombok.Setter;

public class Empleado {

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
