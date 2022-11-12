package com.tienda.ecommerce.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.ecommerce.dominio.Usuario;
import com.tienda.ecommerce.service.IUsuarioService;


@RestController
@RequestMapping("api/usuario")
public class UsuarioRestController {
	
	@Autowired
	IUsuarioService usuarioService;
	
    @GetMapping("/listar")
    public List<Usuario> listarUusarios(){
        return usuarioService.findAll();
    }
	
}
