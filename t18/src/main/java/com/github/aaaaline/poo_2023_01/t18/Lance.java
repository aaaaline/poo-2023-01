package com.github.aaaaline.poo_2023_01.t18;

public class Lance {
    private int numLance;
    private Peca peca;

    private Jogador jogador;

    private Posicao origem;
    private Posicao destino;

    public Lance(int numLance, Peca peca, Jogador jogador, Posicao origem, Posicao destino) {
        this.numLance = numLance;
        this.peca = peca;
        this.jogador = jogador;
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "\n" + numLance + ". " +
               "Jogador: " + jogador +
               ", peça: " + peca +
               ", origem: " + origem +
               ", destino: " + destino;
    }
}