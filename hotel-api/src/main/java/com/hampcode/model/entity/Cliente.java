package com.hampcode.model.entity;

import com.hampcode.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name="Cliente")


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Dni_ce",nullable = false,length = 8)
    private String dni_ce;

    @Column(name="Nombres",nullable = false,length = 50)
    private String nombres;

    @Column(name="Apellidos",nullable = false,length = 50)
    private String apellidos;

    @Column(name="Nacionalidad",nullable = false,length = 50)
    private String nacionalidad;

    @Column(name="email",nullable = false,length = 50)
    private String email;

    @Column(name="Password",nullable = true,length = 20)
    private String password;


    @Column(name="Telefono",nullable = false,length = 20)
    private String telefono;

    @Column(name="Fecha_de_Nacimiento",nullable = false)
    private Date fecha_de_nacimiento;

    @Column(name="Created_At",nullable = false)
    private LocalDateTime createAt;

    @Column(name="Update_At")
    private LocalDateTime updateAt;



    @Enumerated(EnumType.STRING)
    @Column(name="Role")
    private Role role;
    ;


}
