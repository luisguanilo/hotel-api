package com.hampcode.service;
import com.hampcode.model.entity.Pago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PagoServicio   {
    List <Pago> getAll();
    Page <Pago> paginate(Pageable pageable);
    Pago findById(Integer id);
    Pago create(Pago pago);
    Pago update(Integer Id,Pago updatePago);
    void delete(Integer Id);
}
