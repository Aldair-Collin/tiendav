package com.tienda.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ecommerce.dominio.Orden;
import com.tienda.ecommerce.dominio.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}
