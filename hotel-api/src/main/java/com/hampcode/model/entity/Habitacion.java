package com.hampcode.model.entity;


import com.hampcode.model.enums.EstadoHabitacion;
import com.hampcode.model.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="Habitacion")

public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Numero_habitacion",nullable = false,length = 4)
    private String numero_habitacion;



    @Column(name="Capacidad",nullable = false)
    private Integer capacidad;

    @Column(name="Precio_por_noche",nullable = false)
    private float precio_por_noche;



    @Column(name="Created_At")
    private LocalDateTime created_at;

    @Column(name="Update_At")
    private LocalDateTime update_at;

    @ManyToOne
    @JoinColumn(name="servicio_id",referencedColumnName = "id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id")
    private Reservas reserva;


    @Enumerated(EnumType.STRING)
    @Column(name="estado_habitacion")
    private EstadoHabitacion estado_habitacion;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_habitacion")
    private TipoHabitacion tipo_habitacion;


}
