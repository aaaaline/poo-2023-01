package com.github.aaaaline.poo_2023_01.t11;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    List<Funcionario> funcionarios = new ArrayList<>();

    public void addFuncionarios(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void verificarQuantidadeFuncionarios() throws Exception {
        if (funcionarios.size() < 2) {
            throw new Exception("Uma lanchonete deve ter no mínimo dois funcionários.");
        }
    }

    public Funcionario getGerente() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.isGerente()) {
                return funcionario;
            }
        }
        return null;
    }
}