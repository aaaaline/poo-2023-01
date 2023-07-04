package com.github.aaaaline.poo_2023_01.t08.pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nomePais;
    private List<Cidade> cidades;

    public Pais(String nomePais) {
        this.nomePais = nomePais;
        this.cidades = new ArrayList<>();
    }

    public String getNome() {
        return nomePais;
    }

    public void addCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

}