package com.tienda.ecommerce.web.rest;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tienda.ecommerce.dominio.Producto;

import com.tienda.ecommerce.service.ProductoService;
import com.tienda.ecommerce.service.UploadFileService;

@RestController
@RequestMapping("api/producto")
public class ProductoRestController {
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	private UploadFileService upload;
	
    @GetMapping("/listar")
    public List<Producto> listarProductos(){
        return productoService.findAll();
    }
	

    

    @PostMapping("/save")
    public void insertarClientes(@RequestBody Producto producto){
        productoService.save(producto);
    }
    
    
}
