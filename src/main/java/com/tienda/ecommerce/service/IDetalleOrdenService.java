package com.tienda.ecommerce.service;

import java.util.List;

import com.tienda.ecommerce.dominio.DetalleOrden;

public interface IDetalleOrdenService {
	DetalleOrden save (DetalleOrden detalleOrden);
	public List<DetalleOrden> findAll();
}
