package com.github.aaaaline.poo_2023_01.t08.emprego;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    List<Emprego> empregos = new ArrayList<>();
    public List<Pessoa> empregados = new ArrayList<>();

    public void addEmpregos(Emprego emprego) {
        empregos.add(emprego);
    }

    public List<Emprego> getEmpregos() {
        return empregos;
    }

    public void addEmpregados(Pessoa empregado) {
        empregados.add(empregado);
    }

    public List<Pessoa> getEmpregados() {
        return empregados;
    }

}