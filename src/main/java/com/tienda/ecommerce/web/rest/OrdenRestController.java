package com.tienda.ecommerce.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.ecommerce.dominio.Orden;
import com.tienda.ecommerce.service.IOrdenService;


@RestController
@RequestMapping("api/orden")
public class OrdenRestController {
	@Autowired
	IOrdenService ordenService;
	
    @GetMapping("/listar")
    public List<Orden> listarOrden(){
        return ordenService.findAll();
    }
}
