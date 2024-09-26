package com.hampcode.model.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="fecha_pago",nullable = false)
    private LocalDateTime fechapago;

    @Column(name="monto",nullable = false)
    private float monto;

    @Column(name="metodo_de_pago",nullable = false,length = 50)
    private String metododepago;



    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id"
    ,foreignKey = @ForeignKey(name="Fk_pago_reserva"))
    private Reserva reserva;

}
