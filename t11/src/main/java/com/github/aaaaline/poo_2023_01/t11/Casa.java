package com.github.aaaaline.poo_2023_01.t11;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    Sala sala;
    Area area;
    Garagem garagem;
    List<Quarto> quartos;
    List<Banheiro> banheiros;

    public Casa() {
        sala = new Sala();
        area = new Area();
        garagem = new Garagem();
        quartos = new ArrayList<>();
        banheiros = new ArrayList<>();
    }
}