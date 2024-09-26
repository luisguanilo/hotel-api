package com.hampcode.service.impl;

import org.springframework.data.domain.Pageable;

import com.hampcode.model.entity.Reserva;
import com.hampcode.repository.ReservaRepository;
import com.hampcode.service.AdminReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminReservaServiceImpl implements AdminReservaService {
    private final ReservaRepository reservaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Reserva> getAll() {
        return reservaRepository.findAll();
    }

    @Override
    public Page<Reserva> paginate(Pageable pageable) {  // Cambiamos aquí
        return reservaRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Reserva findById(Integer id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva not found"));
    }

    @Transactional
    @Override
    public Reserva create(Reserva reserva) {
        return reservaRepository.save(reserva);
    }


    @Transactional
    @Override
    public Reserva update(Integer id, Reserva updatedReserva) {
        Reserva reservaFromDB = findById(id);
        reservaFromDB.setEstadoReserva(updatedReserva.getEstadoReserva());
        reservaFromDB.setFechainicio(updatedReserva.getFechainicio());
        reservaFromDB.setFechafin(updatedReserva.getFechafin());
        reservaFromDB.setCliente(updatedReserva.getCliente());
        reservaFromDB.setEstadoReserva(updatedReserva.getEstadoReserva());
        return null;
    }

    @Override
    public void delete(Integer id) {
        Reserva reserva = findById(id);
        reservaRepository.delete(reserva);

    }
}
