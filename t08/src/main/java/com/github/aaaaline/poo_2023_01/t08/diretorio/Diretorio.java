package com.github.aaaaline.poo_2023_01.t08.diretorio;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {
    List<Usuario> autorizados = new ArrayList<>();
    List<Usuario> donos = new ArrayList<>();

    public void adicionarAutorizado(Usuario autorizado) {
        autorizados.add(autorizado);
    }

    public List<Usuario> getAutorizados() {
        return autorizados;
    }

    public void adicionarDono(Usuario dono) {
        donos.add(dono);
    }

    public List<Usuario> getDonos() {
        return donos;
    }

}