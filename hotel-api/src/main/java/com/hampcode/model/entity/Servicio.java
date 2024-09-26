package com.hampcode.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="servicio")

public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre_servicio",nullable = false,length = 50)
    private String nombre;

    @Column(name="descripcion",columnDefinition = "TEXT")
    private String descripcion;

    @Column(name="precio",nullable = false)
    private float precio;

    @Column(name="create_at",nullable = false)
    private LocalDateTime createat;

    @Column(name="update_at")
    private LocalDateTime updateat;





}
