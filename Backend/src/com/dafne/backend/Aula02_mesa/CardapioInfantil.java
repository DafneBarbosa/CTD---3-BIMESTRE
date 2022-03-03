package com.dafne.backend.Aula02_mesa;

public class CardapioInfantil extends Produto{

    private double valorPresente;

    public CardapioInfantil(double precoBase, double valorPresente) {
        super(precoBase);
        this.valorPresente = valorPresente;
    }

    @Override
    public void montar() {
        System.out.println("Montagem - Cardapio Infantil - COLOCAR PRESENTE - custo: "+this.precoDeVenda());
    }

    @Override
    public double precoDeVenda() {
        return super.precoBase+this.valorPresente;
    }
}
