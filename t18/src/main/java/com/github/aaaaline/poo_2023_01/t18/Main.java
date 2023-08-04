package com.github.aaaaline.poo_2023_01.t18;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida("Imortal");
        Jogador brancas = new Jogador("Adolf Anderssen");
        Jogador pretas = new Jogador("Lionel Kieseritzky");

        partida.adicionaLance(new Lance(1, Peca.PEAO, brancas, new Posicao('e',2), new Posicao('e',4) ));
        partida.adicionaLance(new Lance(1, Peca.PEAO, pretas, new Posicao('e',7), new Posicao('e',5) ));

        partida.adicionaLance(new Lance(2, Peca.PEAO, brancas, new Posicao('f',2), new Posicao('f',4) ));
        partida.adicionaLance(new Lance(2, Peca.PEAO, pretas, new Posicao('e',5), new Posicao('f',4) ));

        partida.adicionaLance(new Lance(3, Peca.BISPO, brancas, new Posicao('f',1), new Posicao('c',4) ));
        partida.adicionaLance(new Lance(3, Peca.DAMA, pretas, new Posicao('d',8), new Posicao('h',4) ));

        partida.adicionaLance(new Lance(4, Peca.REI, brancas, new Posicao('e',1), new Posicao('f',1) ));
        partida.adicionaLance(new Lance(4, Peca.PEAO, pretas, new Posicao('b',7), new Posicao('b',5) ));

        partida.adicionaLance(new Lance(5, Peca.BISPO, brancas, new Posicao('c',4), new Posicao('b',5) ));
        partida.adicionaLance(new Lance(5, Peca.CAVALO, pretas, new Posicao('g',8), new Posicao('f',6) ));

        partida.adicionaLance(new Lance(6, Peca.CAVALO, brancas, new Posicao('g',1), new Posicao('f',3) ));
        partida.adicionaLance(new Lance(6, Peca.DAMA, pretas, new Posicao('h',4), new Posicao('h',6) ));

        partida.adicionaLance(new Lance(7, Peca.PEAO, brancas, new Posicao('d',2), new Posicao('d',3) ));
        partida.adicionaLance(new Lance(7, Peca.CAVALO, pretas, new Posicao('f',6), new Posicao('h',5) ));

        partida.adicionaLance(new Lance(8, Peca.CAVALO, brancas, new Posicao('f',3), new Posicao('h',4) ));
        partida.adicionaLance(new Lance(8, Peca.DAMA, pretas, new Posicao('h',6), new Posicao('g',5) ));

        partida.adicionaLance(new Lance(9, Peca.CAVALO, brancas, new Posicao('h',4), new Posicao('f',5) ));
        partida.adicionaLance(new Lance(9, Peca.PEAO, pretas, new Posicao('c',7), new Posicao('c',6) ));

        partida.adicionaLance(new Lance(10, Peca.PEAO, brancas, new Posicao('g',2), new Posicao('g',4) ));
        partida.adicionaLance(new Lance(10, Peca.CAVALO, pretas, new Posicao('h',5), new Posicao('f',6) ));

        partida.adicionaLance(new Lance(11, Peca.TORRE, brancas, new Posicao('h',1), new Posicao('g',1) ));
        partida.adicionaLance(new Lance(11, Peca.PEAO, pretas, new Posicao('c',6), new Posicao('b',5) ));

        partida.adicionaLance(new Lance(12, Peca.PEAO, brancas, new Posicao('h',2), new Posicao('h',4) ));
        partida.adicionaLance(new Lance(12, Peca.DAMA, pretas, new Posicao('g',5), new Posicao('g',6) ));

        partida.adicionaLance(new Lance(13, Peca.PEAO, brancas, new Posicao('h',4), new Posicao('h',5) ));
        partida.adicionaLance(new Lance(13, Peca.DAMA, pretas, new Posicao('g',6), new Posicao('g',5) ));

        partida.adicionaLance(new Lance(14, Peca.DAMA, brancas, new Posicao('d',1), new Posicao('f',3) ));
        partida.adicionaLance(new Lance(14, Peca.CAVALO, pretas, new Posicao('f',6), new Posicao('g',8) ));

        partida.adicionaLance(new Lance(15, Peca.BISPO, brancas, new Posicao('c',1), new Posicao('f',4) ));
        partida.adicionaLance(new Lance(15, Peca.DAMA, pretas, new Posicao('g',5), new Posicao('f',6) ));

        partida.adicionaLance(new Lance(16, Peca.CAVALO, brancas, new Posicao('b',1), new Posicao('c',3) ));
        partida.adicionaLance(new Lance(16, Peca.BISPO, pretas, new Posicao('f',8), new Posicao('c',5) ));

        partida.adicionaLance(new Lance(17, Peca.CAVALO, brancas, new Posicao('c',3), new Posicao('d',5) ));
        partida.adicionaLance(new Lance(17, Peca.DAMA, pretas, new Posicao('f',6), new Posicao('b',2) ));

        partida.adicionaLance(new Lance(18, Peca.BISPO, brancas, new Posicao('f',4), new Posicao('d',6) ));
        partida.adicionaLance(new Lance(18, Peca.BISPO, pretas, new Posicao('c',5), new Posicao('g',1) ));

        partida.adicionaLance(new Lance(19, Peca.PEAO, brancas, new Posicao('e',4), new Posicao('e',5) ));
        partida.adicionaLance(new Lance(19, Peca.DAMA, pretas, new Posicao('b',2), new Posicao('a',1) ));

        partida.adicionaLance(new Lance(20, Peca.REI, brancas, new Posicao('f',1), new Posicao('e',2) ));
        partida.adicionaLance(new Lance(20, Peca.CAVALO, pretas, new Posicao('b',8), new Posicao('a',6) ));

        partida.adicionaLance(new Lance(21, Peca.CAVALO, brancas, new Posicao('f',5), new Posicao('g',7) ));
        partida.adicionaLance(new Lance(21, Peca.REI, pretas, new Posicao('e',8), new Posicao('d',8) ));

        partida.adicionaLance(new Lance(22, Peca.DAMA, brancas, new Posicao('f',3), new Posicao('f',6) ));
        partida.adicionaLance(new Lance(22, Peca.CAVALO, pretas, new Posicao('g',8), new Posicao('f',6) ));

        partida.adicionaLance(new Lance(23, Peca.BISPO, brancas, new Posicao('d',6), new Posicao('e',7) )); // cheque-mate

        System.out.println(partida + "\n");
        System.out.println("Adolf Anderssen vence a partida!");
    }
}
