package com.github.aaaaline.poo_2023_01.t18;

public enum Peca {

    CAVALO,
    PEAO,
    DAMA,
    REI,
    BISPO,
    TORRE;

    @Override
    public String toString() {
        return switch (this) {
            case CAVALO -> "cavalo";
            case PEAO -> "peão";
            case DAMA -> "dama";
            case REI -> "rei";
            case BISPO -> "bispo";
            case TORRE -> "torre";
        };
    }
}