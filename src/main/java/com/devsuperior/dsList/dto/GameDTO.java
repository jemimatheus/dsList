package com.devsuperior.dsList.dto;

import com.devsuperior.dsList.entities.Game;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String titulo;
    private  Integer ano;
    private String genero;
    private  String plataforma;
    private Double pontuacao;
    private  String imgUrl;
    private String descCurta;
    private String descLonga;

    public GameDTO(){

    }
    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity,this);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescCurta() {
        return descCurta;
    }

    public void setDescCurta(String descCurta) {
        this.descCurta = descCurta;
    }

    public String getDescLonga() {
        return descLonga;
    }

    public void setDescLonga(String descLonga) {
        this.descLonga = descLonga;
    }
}
