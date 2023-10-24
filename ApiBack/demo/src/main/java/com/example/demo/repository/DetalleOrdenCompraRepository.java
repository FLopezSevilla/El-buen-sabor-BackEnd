package com.example.demo.repository;

import com.example.demo.entities.DetalleOrdenCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleOrdenCompraRepository extends JpaRepository<DetalleOrdenCompra, Long> {
    // Puedes agregar métodos personalizados relacionados con DetalleOrdenCompra si es necesario
}
