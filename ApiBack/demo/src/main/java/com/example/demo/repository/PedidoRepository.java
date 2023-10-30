package com.example.demo.repository;

import com.example.demo.entities.OrdenCompra;
import com.example.demo.entities.Pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
    List<Pedido> findByFechaPedidoContaining(Date fechaPedido);

    Page<Pedido> findByFechaPedidoContaining(Date fechaPedido, Pageable pageable);

    boolean existsByFechaPedido(Date fechaPedido);

    //Anotación
    @Query(
            value = "SELECT * FROM Pedido WHERE Pedido.fechaPedido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Pedido> searchNativo(Date filtro);
    @Query(
            value = "SELECT * FROM Pedido WHERE Pedido.fechaPedido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM Pedido",
            nativeQuery = true
    )
    Page<Pedido> searchNativo(Date filtro, Pageable pageable);

}