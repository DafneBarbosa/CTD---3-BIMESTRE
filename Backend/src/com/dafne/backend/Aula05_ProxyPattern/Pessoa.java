package com.dafne.backend.Aula05_ProxyPattern;

import java.util.Date;

public class Pessoa {

    private String nome, sobrenome, rg, fabricanteVacina;
    private Date dataVacina;

    public Pessoa(String nome, String sobrenome, String rg, String fabricanteVacina, Date dataVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.fabricanteVacina = fabricanteVacina;
        this.dataVacina = dataVacina;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public String getFabricanteVacina() {
        return fabricanteVacina;
    }

    public Date getDataVacina() {
        return dataVacina;
    }
}
