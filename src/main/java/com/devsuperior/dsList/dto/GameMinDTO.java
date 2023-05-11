package com.devsuperior.dsList.dto;

import com.devsuperior.dsList.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {


    private Long id;
    private String titulo;
    private  Integer ano;
    private  String imgUrl;
    private String descCurta;


    public  GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
       id = entity.getId();
        titulo = entity.getTitulo();
        ano = entity.getAno();
       imgUrl = entity.getImgUrl();
       descCurta = entity.getDescCurta();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescCurta() {
        return descCurta;
    }
}
