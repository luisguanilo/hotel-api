package com.hampcode.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="reserva_servicio")
@IdClass(ReservaServicioPK.class)
public class Reserva_Servicio {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_reserva_servicio_reserva"))
    private Reservas reserva;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_reserva_servicio_servicio"))
    private Servicio servicio;

    @Column(name = "added_date")
    private LocalDateTime addedDate;
}
