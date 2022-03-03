package com.dafne.backend.Aula05_ProxyPattern;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Date dataVac = new Date();

    @Test
    public void vacinar(){
        Pessoa p1 = new Pessoa("Dafne", "Barbosa", "123456789", "Pfizer", dataVac);
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getFabricanteVacina());

    }

}