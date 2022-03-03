package com.dafne.backend.Aula06_mesa.services;

import com.dafne.backend.Aula06_mesa.exception.SerieNaoHabilitadaException;

public class SerieProxy implements ISerie{

    private int qtdViews;

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if(this.qtdViews<5){
            Serie serie = new Serie();
            this.qtdViews++;
            System.out.println("Link para a série: "+serie.getSerie(nome));
            return serie.getSerie(nome);
        }
        throw new SerieNaoHabilitadaException("Você já atingiu o seu limite de visualizações");
    }
}
