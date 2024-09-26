package com.hampcode.model.entity;
import com.hampcode.model.enums.EstadoHabitacion;
import com.hampcode.model.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="habitaciones")

public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="numero_habitacion",nullable = false,length = 4)
    private String numeroHabitacion;

    @Column(name="capacidad",nullable = false)
    private Integer capacidad;

    @Column(name="precio_por_noche",nullable = false)
    private float precioPorNoche;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="update_at")
    private LocalDateTime updateAt;

    @Enumerated(EnumType.STRING)
    @Column(name="estado_habitacion")
    private EstadoHabitacion estadoHabitacion;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_habitacion")
    private TipoHabitacion tipoHabitacion;


    @ManyToOne
    @JoinColumn(name="servicio_id",referencedColumnName = "id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id")
    private Reservas reservas;
}
