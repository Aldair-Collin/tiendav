package com.tienda.ecommerce.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.ecommerce.dominio.DetalleOrden;
import com.tienda.ecommerce.service.IDetalleOrdenService;

@RestController
@RequestMapping("api/detalle")
public class DetalleOrdenRestController {

	@Autowired
	IDetalleOrdenService  detalleOrdenService;
	
    @GetMapping("/listar")
    public List<DetalleOrden> listarOrden(){
        return detalleOrdenService.findAll();
    }
	
}
