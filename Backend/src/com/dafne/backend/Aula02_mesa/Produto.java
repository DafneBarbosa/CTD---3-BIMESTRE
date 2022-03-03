package com.dafne.backend.Aula02_mesa;

public abstract class Produto {

    protected double precoBase;

    public Produto(double precoBase){
        this.precoBase = precoBase;
    }

    public abstract void montar();
    public abstract double precoDeVenda();
}
