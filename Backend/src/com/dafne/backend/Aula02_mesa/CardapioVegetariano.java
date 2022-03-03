package com.dafne.backend.Aula02_mesa;

public class CardapioVegetariano extends Produto{

    private double valorEmbalagem;
    private double sobretaxa;

    public CardapioVegetariano(double precoBase, double valorEmbalagem) {
        super(precoBase);
        this.valorEmbalagem = valorEmbalagem;
        this.sobretaxa = 0.01*super.precoBase;
    }

    @Override
    public void montar() {
        System.out.println("Montagem - Cardapio Vegetariano - ADICIONAR EMBALAGEM ESPECIAL - custo: "+this.precoDeVenda());
    }

    @Override
    public double precoDeVenda() {
        return super.precoBase+this.valorEmbalagem+this.sobretaxa;
    }
}
