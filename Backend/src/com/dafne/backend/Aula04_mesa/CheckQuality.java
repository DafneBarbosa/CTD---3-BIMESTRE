package com.dafne.backend.Aula04_mesa;

public abstract class CheckQuality {

    protected CheckQuality seguinteCategoria;

    public abstract void processarSolicitacao(Artigo artigo);

    public CheckQuality setSeguinteCategoria(CheckQuality seguinteCategoria){
        this.seguinteCategoria = seguinteCategoria;
        return this;
    }
}
