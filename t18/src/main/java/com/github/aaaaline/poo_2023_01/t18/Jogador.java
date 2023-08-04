package com.github.aaaaline.poo_2023_01.t18;

import java.util.Objects;

public class Jogador {

    private String nome;

    public Jogador(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O jogador deve possuir um nome");
        }

        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}