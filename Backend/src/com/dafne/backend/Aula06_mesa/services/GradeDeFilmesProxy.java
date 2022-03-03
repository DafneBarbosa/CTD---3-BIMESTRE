package com.dafne.backend.Aula06_mesa.services;

import com.dafne.backend.Aula06_mesa.exception.FilmeNaoHabilitadoException;
import com.dafne.backend.Aula06_mesa.model.Filme;
import com.dafne.backend.Aula06_mesa.model.Ip;

public class GradeDeFilmesProxy implements IGradeDeFilmes {

    private Ip ip;

    public GradeDeFilmesProxy(Ip ip) {
        this.ip = ip;
    }

    @Override
    public Filme getFilme(String nome) throws FilmeNaoHabilitadoException {
        GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();
        Filme filme = gradeDeFilmes.getFilme(nome);

        if(filme.getPais().equalsIgnoreCase(ip.getPais())){
            System.out.println("Acesso permitido ao seu país, bom filme! "+filme);
            return filme;
        }

        throw new FilmeNaoHabilitadoException("Filme não disponível no seu país");

    }
}
