package com.devsuperior.dsList.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private  Integer ano;
    private String genero;
    private  String plataforma;
    private Double pontuacao;
    private  String imgUrl;
    private String descCurta;
    private String descLonga;


    public Games (){

    }

    public Games(Long id, String titulo, Integer ano, String genero, String plataforma, Double pontuacao, String imgUrl, String descCurta, String descLonga ) {

        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.pontuacao = pontuacao;
        this.imgUrl = imgUrl;
        this.descCurta = descCurta;
        this.descLonga = descLonga;
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

    /*Métodos para compararar através de id, se dois games são iguais */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(id, games.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}