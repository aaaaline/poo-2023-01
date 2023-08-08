package com.github.aaaaline.poo_2023_01.t21;

import java.util.Objects;

public class Preco extends Object {

    private double valor;
    private Moeda moeda;

    public Preco(double valor, Moeda moeda) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor não pode ser negativo");
        }

        Objects.requireNonNull(moeda, "nao pode ser nulo");

        this.valor = valor;
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public static Preco reais(double valor) {
        return new Preco(valor, Moeda.REAL);
    }

    @Override
    public String toString() {
        return "Preco{" +
                "valor=" + valor +
                ", moeda=" + moeda +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Preco.reais(10));
    }
}
