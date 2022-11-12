package com.tienda.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.ecommerce.dao.IUsuarioRepository;
import com.tienda.ecommerce.dominio.Usuario;
import com.tienda.ecommerce.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	
}
