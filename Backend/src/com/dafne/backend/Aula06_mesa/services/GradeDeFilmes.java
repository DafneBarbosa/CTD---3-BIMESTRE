package com.dafne.backend.Aula06_mesa.services;

import com.dafne.backend.Aula06_mesa.model.Filme;

public class GradeDeFilmes implements IGradeDeFilmes {
    @Override
    public Filme getFilme(String nome) {

        for(int i = 0; i< Filme.getFilmes().size(); i++){
            if(Filme.getFilmes().get(i).getNome().equalsIgnoreCase(nome)){
                return Filme.getFilmes().get(i);
            }
        }

        return null;
    }
}
