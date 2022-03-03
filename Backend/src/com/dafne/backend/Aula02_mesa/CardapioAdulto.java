package com.dafne.backend.Aula02_mesa;

public class CardapioAdulto extends Produto{

    public CardapioAdulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montar() {
        System.out.println("Montagem - Cardapio Adulto - custo: "+this.precoDeVenda());
    }

    @Override
    public double precoDeVenda() {
        return super.precoBase;
    }
}
