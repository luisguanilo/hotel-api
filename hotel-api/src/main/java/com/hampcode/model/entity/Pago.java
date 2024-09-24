package com.hampcode.model.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Fecha_Pago",nullable = false)
    private LocalDateTime fecha_pago;

    @Column(name="Monto",nullable = false)
    private float monto;

    @Column(name="Metodo_de_pago",nullable = false,length = 50)
    private String metodo_pago;



    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id"
    ,foreignKey = @ForeignKey(name="Fk_Pago_reserva"))
    private Reservas reserva;

}
