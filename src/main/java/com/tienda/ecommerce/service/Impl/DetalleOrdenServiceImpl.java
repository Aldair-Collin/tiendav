package com.tienda.ecommerce.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.ecommerce.dao.IDetalleOrdenRepository;
import com.tienda.ecommerce.dominio.DetalleOrden;
import com.tienda.ecommerce.service.IDetalleOrdenService;


@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

	@Override
	public List<DetalleOrden> findAll() {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.findAll();
	}

}
