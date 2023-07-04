package com.github.aaaaline.poo_2023_01.t08.emprego;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    List<Emprego> empregos = new ArrayList<>();
    public List<Empresa> empregadores = new ArrayList<>();

    public void addEmpregadores(Empresa empregador) {
        empregadores.add(empregador);
    }

    public List<Empresa> getEmpregadores() {
        return empregadores;
    }

}