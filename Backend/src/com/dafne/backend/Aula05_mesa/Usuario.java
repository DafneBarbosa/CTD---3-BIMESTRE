package com.dafne.backend.Aula05_mesa;

public class Usuario {

    String nome, tipo;

    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
