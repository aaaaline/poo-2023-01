package com.github.aaaaline.poo_2023_01.t18;

public class Posicao {

    private char x; // a-h

    private int y; // 1-8

    public Posicao(int x, int y) {
        this.x = (char) x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + y + ')';
    }
}