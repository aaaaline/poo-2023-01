package com.github.aaaaline.poo_2023_01.t07.escola;

public class Prova {
    private byte numQuestoes;

    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes (byte n) {
        if (n > 0) {
            numQuestoes = n;
        }
    }

}