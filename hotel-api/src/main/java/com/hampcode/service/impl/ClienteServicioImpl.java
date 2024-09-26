package com.hampcode.service.impl;
import org.springframework.transaction.annotation.Transactional;
import com.hampcode.model.entity.Cliente;
import com.hampcode.repository.ClienteRepository;
import com.hampcode.service.ClienteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequiredArgsConstructor
@Service
public class ClienteServicioImpl implements ClienteServicio {
    private final ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> paginate(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("No se encontro el cliente con el id: " + id));
    }

    @Override
    @Transactional
    public Cliente create(Cliente cliente) {
        cliente.setCreateAt(LocalDateTime.now());
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public Cliente update(Integer id, Cliente updateCliente) {
        Cliente clienteFromDB = findById(id);
        clienteFromDB.setNombres(updateCliente.getNombres());
        clienteFromDB.setApellidos(updateCliente.getApellidos());
        clienteFromDB.setEmail(updateCliente.getEmail());
        clienteFromDB.setTelefono(updateCliente.getTelefono());
        clienteFromDB.setUpdateAt(LocalDateTime.now());

        return clienteRepository.save(clienteFromDB);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);

    }
}
