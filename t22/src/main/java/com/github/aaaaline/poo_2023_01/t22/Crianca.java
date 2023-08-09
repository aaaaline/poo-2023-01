package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Crianca extends Visitante {
    List<Visitante> acompanhantes;

    public Crianca(Pessoa pessoa) {
        super(pessoa);
        this.acompanhantes = new ArrayList<>();
    }


    public void adicionarAcompanhante(Visitante visitante) {
        acompanhantes.add(visitante);
    }
}