package com.hackathon.api.models.enums;

import lombok.Getter;

@Getter
public enum AreaConhecimento {

    CH("Ciências Humanas e suas Tecnologias"),
    CN("Ciências da Natureza e suas Tecnologias"),
    LC("Linguagens, Códigos e suas Tecnologias"),
    MT("Matemática e suas Tecnologias");

    private String nomeCategoria;

    AreaConhecimento(String nomeCategoria){
        this.nomeCategoria = nomeCategoria;
    }
}
