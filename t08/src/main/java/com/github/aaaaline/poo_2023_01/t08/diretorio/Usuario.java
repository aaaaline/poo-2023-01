package com.github.aaaaline.poo_2023_01.t08.diretorio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    protected List<Diretorio> diretorios = new ArrayList<>();

    public void adicionarDiretorio(Diretorio diretorio) {
        diretorios.add(diretorio);
    }

    public List<Diretorio> getDiretorios() {
        return diretorios;
    }

}