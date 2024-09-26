package com.hampcode.model.entity;



import com.hampcode.model.enums.EstadoReserva;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="reservas")

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="fecha_inicio")
    private LocalDateTime fechainicio;

    @Column(name="fecha_fin")
    private LocalDateTime fechafin;


    @Enumerated(EnumType.STRING)
    @Column(name="estado_reserva")
    private EstadoReserva estadoReserva;

    @ManyToOne
    @JoinColumn(name="cliente_id",referencedColumnName ="id",
    foreignKey =@ForeignKey(name="FK_reserva_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="habitacion_id",referencedColumnName = "id",
    foreignKey = @ForeignKey(name="FK_reserva_habitacion"))
    private Habitacion habitacion;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<Reserva_Servicio>items;

}
