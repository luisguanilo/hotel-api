package com.hampcode.model.entity;



import com.hampcode.model.enums.EstadoReserva;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="Reservas")

public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Fecha_Inicio")
    private LocalDateTime fecha_inicio;

    @Column(name="Fecha_Fin")
    private LocalDateTime fecha_fin;

    @Enumerated(EnumType.STRING)
    @Column(name="Estado_Reserva")
    private EstadoReserva estadoReserva;

    @ManyToOne
    @JoinColumn(name="Cliente_Id",referencedColumnName ="id",
    foreignKey =@ForeignKey(name="FK_reserva_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="habitacion_id",referencedColumnName = "id",
    foreignKey = @ForeignKey(name="FK_reserva_habitacion"))
    private Habitacion habitacion;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<Reserva_Servicio>items;

}
