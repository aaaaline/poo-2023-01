package com.github.aaaaline.poo_2023_01.t11;

import java.util.ArrayList;
import java.util.List;

public class Palavra {
    List<Letra> letras = new ArrayList<>();

    public void adicionarLetra(Letra letra) {
        if (letra == null) {
            throw new IllegalArgumentException("Uma palavra deve ter no mínimo uma letra.");
        }
        letras.add(letra);
    }

}