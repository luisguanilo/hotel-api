package com.hampcode.model.entity;


import com.hampcode.model.enums.EstadoHabitacion;
import com.hampcode.model.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="habitacion")

public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="numero_habitacion",nullable = false,length = 4)
    private String numerohabitacion;



    @Column(name="capacidad",nullable = false)
    private Integer capacidad;

    @Column(name="precio_por_noche",nullable = false)
    private float preciopornoche;



    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="update_at")
    private LocalDateTime updateAt;

    @ManyToOne
    @JoinColumn(name="servicio_id",referencedColumnName = "id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id")
    private Reserva reserva;


    @Enumerated(EnumType.STRING)
    @Column(name="estado_habitacion")
    private EstadoHabitacion estado_habitacion;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_habitacion")
    private TipoHabitacion tipo_habitacion;


}
