package com.dafne.backend.Aula06_mesa.services;

public class Serie implements ISerie{
    @Override
    public String getSerie(String nome) {
        return ("www."+nome);
    }
}
