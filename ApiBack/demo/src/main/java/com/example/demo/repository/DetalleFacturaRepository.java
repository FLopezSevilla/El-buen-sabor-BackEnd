package com.example.demo.repository;

import com.tup.buensabor.entities.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleFactura si es necesario
}
