package com.hampcode.service;

import com.hampcode.model.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteServicio {
    List<Cliente> getAll();
    Page<Cliente> paginate(Pageable pageable);
    Cliente findById(Integer id);
    Cliente create(Cliente cliente);
    Cliente update(Integer Id, Cliente updateCliente);
    void delete(Integer Id);

}