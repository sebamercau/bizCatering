package com.smercau.bizCatering.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name="ticket")
public class TicketEntity {

    @Getter @Setter
    private long idTicket;

    @Getter @Setter
    private Date fechaTicket;

    @Getter @Setter
    private EmpleadoEntity empleadoEntity;

    @Getter @Setter
    private List<ProductoEntity> listadoProductos;

}