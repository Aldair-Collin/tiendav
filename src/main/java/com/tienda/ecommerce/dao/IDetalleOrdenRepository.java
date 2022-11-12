package com.tienda.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ecommerce.dominio.DetalleOrden;


@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
