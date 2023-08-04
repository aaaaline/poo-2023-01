package com.github.aaaaline.poo_2023_01.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private String nome;

    private List<Lance> lances = new ArrayList<>();

    public Partida(String nome) {
        this.nome = nome;
    }

    public void adicionaLance(Lance lance) {
        if (lance == null) {
            throw new IllegalArgumentException("É exigido um lance");
        }

        lances.add(lance);
    }

    @Override
    public String toString() {
        return "Partida " + nome + ": "
                + lances;
    }
}