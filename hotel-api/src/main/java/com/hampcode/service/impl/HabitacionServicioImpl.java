package com.hampcode.service.impl;

import com.hampcode.model.entity.Habitacion;
import com.hampcode.repository.HabitacionRepository;
import com.hampcode.service.HabitacionServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class HabitacionServicioImpl implements HabitacionServicio {
    private final HabitacionRepository habitacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Habitacion> getAll() {
        return habitacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Habitacion> paginate(Pageable pageable) {
        return habitacionRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Habitacion findById(Integer id) {
        return habitacionRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No existe el habitacion con el id: " + id));
    }

    @Override
    @Transactional
    public Habitacion create(Habitacion habitacion) {
        habitacion.setCreatedAt(LocalDateTime.now());
        return habitacionRepository.save(habitacion);
    }

    @Override
    @Transactional
    public Habitacion update(Integer id, Habitacion updateHabitacion) {
        Habitacion habitacionFromDB = findById(id);
        habitacionFromDB.setNumeroHabitacion(updateHabitacion.getNumeroHabitacion());
        habitacionFromDB.setCapacidad(updateHabitacion.getCapacidad());
        habitacionFromDB.setPrecioPorNoche(updateHabitacion.getPrecioPorNoche());
        habitacionFromDB.setEstadoHabitacion(updateHabitacion.getEstadoHabitacion());
        habitacionFromDB.setTipoHabitacion(updateHabitacion.getTipoHabitacion());
        habitacionFromDB.setUpdateAt(LocalDateTime.now());
        return habitacionRepository.save(habitacionFromDB);
    }

    @Override
    @Transactional
    public void delete(Integer Id) {
        Habitacion habitacion = findById(Id);
        habitacionRepository.delete(habitacion);

    }
}
