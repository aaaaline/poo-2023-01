package com.github.aaaaline.poo_2023_01.t22;

import java.util.ArrayList;
import java.util.List;

public class Ocorrencia {
    private String descricao;
    private List<Pessoa> envolvidos;

    public Ocorrencia(String descricao) {
        this.descricao = descricao;
        this.envolvidos = new ArrayList<>();
    }

    public void adicionarEnvolvido(Pessoa pessoa) {
        envolvidos.add(pessoa);
    }
}