package com.hampcode.model.entity;


import com.hampcode.model.enums.EstadoPago;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="fecha_pago",nullable = false)
    private LocalDateTime fechaPago;

    @Column(name="monto",nullable = false)
    private float monto;

    @Column(name="metodo_de_pago",nullable = false,length = 50)
    private String metodoPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pago")
    private EstadoPago estadoPago;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="reserva_id",referencedColumnName = "id"
    ,foreignKey = @ForeignKey(name="Fk_pago_reserva"))
    private Reserva reserva;

    @OneToMany(mappedBy = "pago", cascade = CascadeType.ALL)
    private List<Reserva_Servicio> servicios;
}
