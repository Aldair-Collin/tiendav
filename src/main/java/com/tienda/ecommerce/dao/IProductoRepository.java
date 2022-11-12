package com.tienda.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ecommerce.dominio.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
