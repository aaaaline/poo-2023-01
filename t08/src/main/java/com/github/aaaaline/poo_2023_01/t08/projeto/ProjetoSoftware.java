package com.github.aaaaline.poo_2023_01.t08.projeto;

import java.util.List;
import java.util.ArrayList;

public class ProjetoSoftware {
    private List<String> linguagensProgramacao;

    public ProjetoSoftware() {
        linguagensProgramacao = new ArrayList<>();
    }

    public void addLinguagensProgramacao(String linguagem) {
        linguagensProgramacao.add(linguagem);
    }

}