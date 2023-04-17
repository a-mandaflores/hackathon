package com.hackathon.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.api.dto.materia.DadosCadastroMateriaDTO;
import com.hackathon.api.models.Materia;
import com.hackathon.api.repositories.MateriaRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    private MateriaRepository repository;
    
    @PostMapping
    @Transactional
    public void cadastro(@RequestBody DadosCadastroMateriaDTO dados){
        repository.save(new Materia(dados));
    }

}
