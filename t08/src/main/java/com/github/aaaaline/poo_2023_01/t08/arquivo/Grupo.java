package com.github.aaaaline.poo_2023_01.t08.arquivo;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Permissao> permissoes = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

}