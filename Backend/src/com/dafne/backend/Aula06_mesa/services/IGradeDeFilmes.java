package com.dafne.backend.Aula06_mesa.services;

import com.dafne.backend.Aula06_mesa.exception.FilmeNaoHabilitadoException;
import com.dafne.backend.Aula06_mesa.model.Filme;

public interface IGradeDeFilmes {

    public Filme getFilme(String nome) throws FilmeNaoHabilitadoException;
}
