package com.tienda.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.tienda.ecommerce.dominio.Orden;
import com.tienda.ecommerce.dominio.Usuario;


public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
