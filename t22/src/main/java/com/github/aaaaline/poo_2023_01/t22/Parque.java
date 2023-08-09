package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nome;
    private Calendario calendario;
    private List<Visitante> visitantes;

    public Parque(String nome) {
        this.nome = nome;
        this.calendario = new Calendario();
        this.visitantes = new ArrayList<>();
    }

    public void adicionarDataAberta(Data data) {
        calendario.adicionarDataAberta(data);
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }
}