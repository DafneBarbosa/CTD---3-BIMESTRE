package com.dafne.backend.Aula06_mesa.model;

import java.util.ArrayList;

public class Filme {

    private String nome, pais, link;

    private static ArrayList<Filme> filmes = new ArrayList<>();

    public Filme(String nome, String pais, String link) {
        this.nome = nome;
        this.pais = pais;
        this.link = link;

        filmes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getLink() {
        return link;
    }

    public static ArrayList<Filme> getFilmes(){ return filmes;}

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
