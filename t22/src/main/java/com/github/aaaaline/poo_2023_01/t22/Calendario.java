package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Data> datasAbertas;

    public Calendario() {
        datasAbertas = new ArrayList<>();
    }

    public void adicionarDataAberta(Data data) {
        datasAbertas.add(data);
    }
}