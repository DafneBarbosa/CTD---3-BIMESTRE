package com.dafne.backend.Aula06_mesa.services;

import com.dafne.backend.Aula06_mesa.exception.SerieNaoHabilitadaException;

public interface ISerie {
    public String getSerie(String nome) throws SerieNaoHabilitadaException;
}
