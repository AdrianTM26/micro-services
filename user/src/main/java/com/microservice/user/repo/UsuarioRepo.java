package com.microservice.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.user.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{

}
