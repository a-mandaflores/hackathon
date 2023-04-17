package com.hackathon.api.dto.materia;

import com.hackathon.api.models.enums.AreaConhecimento;

public record DadosCadastroMateriaDTO(

    String nome,
    AreaConhecimento areaConhecimento
    ){

}
