package com.hampcode.model.entity;

import com.hampcode.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="dni_ce",nullable = false,length = 20)
    private String dniCe;

    @Column(name="nombres",nullable = false,length = 50)
    private String nombres;

    @Column(name="apellidos",nullable = false,length = 50)
    private String apellidos;

    @Column(name="nacionalidad",nullable = false,length = 50)
    private String nacionalidad;

    @Column(name="email" ,unique = true,nullable = false,length = 50)
    private String email;

    @Column(name="password",nullable = false,length = 20)
    private String password;

    @Column(name="telefono",nullable = false,length = 20)
    private String telefono;

    @Column(name="fecha_de_nacimiento",nullable = false)
    private Date fecha_de_nacimiento;

    @Column(name="created_at",nullable = false)
    private LocalDateTime createAt;

    @Column(name="update_at")
    private LocalDateTime updateAt;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;

}
