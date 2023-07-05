package com.github.aaaaline.poo_2023_01.t10.oficina;

import java.util.ArrayList;
import java.util.List;

public class Conserto extends Servicos {
    Bicicleta bicicleta;
    String descricao;
    int prazo; // em dias
    List<String> pecas = new ArrayList<>();
}