package com.hackathon.api.models;

import java.util.ArrayList;
import java.util.List;

import com.hackathon.api.dto.usuario.DadosCadastroUsuarioDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {
    
    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;

    @OneToMany(targetEntity = Materia.class, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST })
    private List<Materia> materias  = new ArrayList<Materia>();;

    public Usuario(DadosCadastroUsuarioDTO dados){
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
    }

}
