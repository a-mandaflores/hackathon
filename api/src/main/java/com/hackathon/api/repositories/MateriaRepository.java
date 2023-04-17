package com.hackathon.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.api.models.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long>{
    
}
