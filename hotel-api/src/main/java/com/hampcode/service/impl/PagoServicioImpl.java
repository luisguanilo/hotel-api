package com.hampcode.service.impl;

import com.hampcode.model.entity.Pago;
import com.hampcode.repository.PagoRepository;
import com.hampcode.service.PagoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class PagoServicioImpl implements PagoServicio {
    private final PagoRepository pagoRepository;

    @Override
    @Transactional(readOnly = true)
        public List<Pago> getAll() {
        return pagoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Pago> paginate(Pageable pageable) {
        return pagoRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Pago findById(Integer id) {
        return pagoRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No existe el pago Id: " + id));
    }

    @Override
    @Transactional
    public Pago create(Pago pago) {
        pago.setCreatedAt(LocalDateTime.now());
        return pagoRepository.save(pago);
    }

    @Override
    @Transactional
    public Pago update(Integer id, Pago updatePago) {
        Pago pagoFromDB = findById(id);
        pagoFromDB.setFechaPago(updatePago.getFechaPago());
        pagoFromDB.setMonto(updatePago.getMonto());
        pagoFromDB.setMetodoPago(updatePago.getMetodoPago());
        pagoFromDB.setEstadoPago(updatePago.getEstadoPago());
        pagoFromDB.setUpdatedAt(LocalDateTime.now());
        return pagoRepository.save(pagoFromDB);
    }

    @Override
    @Transactional
    public void delete(Integer Id) {
        Pago pago = findById(Id);
        pagoRepository.delete(pago);

    }
}
