package com.hampcode.model.entity;

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

    @Column(name="created_at",nullable = false)
    private LocalDateTime createdat;

    @Column(name="update_at")
    private LocalDateTime updateat;





}
