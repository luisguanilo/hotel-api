package com.hampcode.service;

import com.hampcode.model.entity.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import java.awt.print.Pageable;
import java.util.List;

public interface AdminReservaService {
    List<Reserva> getAll();

    Page<Reserva> paginate(Pageable pageable);

    Reserva findById(Integer id);

    Reserva create(Reserva reserva);

    Reserva update(Integer id, Reserva updatedReserva);

    void delete(Integer id);


}
