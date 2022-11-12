package com.tienda.ecommerce.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ecommerce.dominio.Usuario;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByEmail(String email);
}
