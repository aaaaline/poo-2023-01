package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Visitante {
    Pessoa pessoa;
    private List<Crianca> criancasAcompanhadas;

    public Visitante(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.criancasAcompanhadas = new ArrayList<>();
    }

    public String getNome() {
        return pessoa.getNome();
    }

    public void adicionarCriancaAcompanhada(Crianca crianca) {
        criancasAcompanhadas.add(crianca);
    }
}