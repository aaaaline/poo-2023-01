package com.github.aaaaline.poo_2023_01.t08.pontos;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.util.List;

public class Curva {
    private List<Ponto> pontos = new ArrayList<>();

    public Curva(Ponto x, Ponto y) {
        if(x == null || y == null) {
            throw new IllegalArgumentException("Uma curva deve estar associada a, no mínimo, dois pontos");
        }

        pontos.add(x);
        pontos.add(y);
    }

    public void addPontos(Ponto p) {
        pontos.add(p);
    }

}