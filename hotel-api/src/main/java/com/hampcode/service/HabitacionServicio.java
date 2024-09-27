package com.hampcode.service;

import com.hampcode.model.entity.Habitacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HabitacionServicio {
    List <Habitacion> getAll();
    Page<Habitacion> paginate(Pageable pageable);
    Habitacion findById(Integer id);
    Habitacion create(Habitacion habitacion);
    Habitacion update(Integer Id, Habitacion updateHabitacion);
    void delete(Integer Id);
}
