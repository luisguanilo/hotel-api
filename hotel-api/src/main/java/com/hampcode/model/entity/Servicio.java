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

    @Column(name="Nombre_Servicio",nullable = false,length = 50)
    private String nombre;

    @Column(name="Descripcion",columnDefinition = "TEXT")
    private String descripcion;

    @Column(name="Precio",nullable = false)
    private float precio;

    @Column(name="Create_At",nullable = false)
    private LocalDateTime createat;

    @Column(name="Update_At")
    private LocalDateTime updateat;





}
