package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    Pessoa pessoa;
    Posto posto;

    public Trabalhador(Pessoa pessoa, Posto posto) {
        this.pessoa = pessoa;
        this.posto = posto;
    }

    public String getNome() {
        return pessoa.getNome();
    }
}