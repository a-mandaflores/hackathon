package com.hackathon.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.api.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
