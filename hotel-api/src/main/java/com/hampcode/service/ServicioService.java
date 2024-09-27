package com.hampcode.service;

import com.hampcode.model.entity.Servicio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServicioService {
    List<Servicio> getAll();
    Page<Servicio> paginate(Pageable pageable);
    Servicio findById(Integer id);
    Servicio create(Servicio servicio);
    Servicio update(Integer Id, Servicio updateServicio);
    void delete(Integer id);
}
