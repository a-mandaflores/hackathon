package com.hackathon.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.api.dto.usuario.DadosCadastroUsuarioDTO;
import com.hackathon.api.models.Usuario;
import com.hackathon.api.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
    
    @PostMapping
    @Transactional
    public void cadastro(@RequestBody DadosCadastroUsuarioDTO dados){
        repository.save(new Usuario(dados));
    }

}
