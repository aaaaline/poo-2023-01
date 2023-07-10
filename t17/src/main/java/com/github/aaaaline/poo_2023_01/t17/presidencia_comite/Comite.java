package com.github.aaaaline.poo_2023_01.t17.presidencia_comite;

public class Comite {
    Pessoa[] membros;
    Pessoa[] presidentes;

    public Comite(Pessoa[] membros, Pessoa[] presidentes) {
        this.membros = membros;
        this.presidentes = presidentes;

        if (presidentes.length != 2 && presidentes.length != 3) {
            System.out.println("Um comitê deve ter 2 ou 3 presidentes.");
        }
    }
}