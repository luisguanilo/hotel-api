package com.hampcode.model.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ReservaServicioPK implements Serializable {

    private Integer reserva;
    private Integer servicio;


}
