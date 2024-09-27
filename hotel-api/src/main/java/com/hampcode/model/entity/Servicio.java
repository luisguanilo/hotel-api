package com.hampcode.model.entity;

import com.hampcode.model.enums.TipoServicio;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="servicios")

public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name="descripcion",columnDefinition = "TEXT")
    private String descripcion;

    @Column(name="precio",nullable = false)
    private float precio;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_servicio", nullable = false)
    private TipoServicio tipoServicio;

    @Column(name="create_at",nullable = false)
    private LocalDateTime createAt;

    @Column(name="update_at")
    private LocalDateTime updateAt;

}
