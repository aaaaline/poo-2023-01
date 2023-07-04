package com.github.aaaaline.poo_2023_01.t08.pais;

public class Cidade {
    private String nomeCidade;
    private Pais pais;

    public Cidade(String nomeCidade, Pais pais) {
        this.nomeCidade = nomeCidade;
        this.pais = pais;
        pais.addCidade(this);
    }

    public String getNome() {
        return nomeCidade;
    }

    public Pais getPais() {
        return pais;
    }

}