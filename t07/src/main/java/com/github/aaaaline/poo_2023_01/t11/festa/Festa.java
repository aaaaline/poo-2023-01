package com.github.aaaaline.poo_2023_01.t11.festa;

import java.util.TreeSet;
import java.util.Set;
public class Festa {
    private Set convidados = new TreeSet();

    public void novoConvidado (Convidado c) {
        convidados.add(c);
    }

    public Festa (Convidado c) {
        convidados.add(c);
    }
}
