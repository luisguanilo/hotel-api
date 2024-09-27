package com.hampcode.service.impl;

import com.hampcode.model.entity.Servicio;
import com.hampcode.repository.ServicioRepository;
import com.hampcode.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioServiceImpl implements ServicioService {
    private final ServicioRepository servicioRepository;

    @Override
    @Transactional(readOnly = true)

    public List<Servicio> getAll() {
        return servicioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Servicio> paginate(Pageable pageable) {
        return servicioRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Servicio findById(Integer id) {
        return servicioRepository.findById(id)
                .orElseThrow(()->new RuntimeException("no se encontró servicio con el id: " + id));
    }

    @Override
    @Transactional
    public Servicio create(Servicio servicio) {
        servicio.setCreateAt(LocalDateTime.now());
        return servicioRepository.save(servicio);
    }

    @Override
    @Transactional
    public Servicio update(Integer id, Servicio updateServicio) {
        Servicio servicioFromDB = findById(id);
        servicioFromDB.setNombre(updateServicio.getNombre());
        servicioFromDB.setDescripcion(updateServicio.getDescripcion());
        servicioFromDB.setPrecio(updateServicio.getPrecio());
        servicioFromDB.setTipoServicio(updateServicio.getTipoServicio());
        servicioFromDB.setUpdateAt(LocalDateTime.now());
                return servicioRepository.save(servicioFromDB);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        Servicio servicio = findById(id);
        servicioRepository.delete(servicio);
        }
}
