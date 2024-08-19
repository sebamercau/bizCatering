package com.smercau.bizCatering.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="ticketEntity")
@Getter
@Setter
@NoArgsConstructor
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket", nullable = false)
    private long idTicket;

    @Column(name = "fecha_ticket", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime fechaTicket;

    @Column(name = "id_empleado", nullable = false)
    private EmpleadoEntity empleadoEntity;


    //@Column (name = "productos")
    //private List<ProductoEntity> listadoProductos;

}