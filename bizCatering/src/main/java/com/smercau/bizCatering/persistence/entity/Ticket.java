package com.smercau.bizCatering.persistence.entity;


public class Ticket {

    @Getter @Setter
    private long idTicket;

    @Getter @Setter
    private Date fechaTicket;

    @Getter @Setter
    private Empleado empleado;

    @Getter @Setter
    private List<Productos> listadoProductos;

}