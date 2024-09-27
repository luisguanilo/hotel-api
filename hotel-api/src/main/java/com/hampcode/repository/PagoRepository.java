package com.hampcode.repository;

import com.hampcode.model.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository <Pago, Integer> {
}
