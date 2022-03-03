package com.dafne.backend.Aula05_ProxyPattern;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String fabricanteVacina) {

        if(dataVacina.before((new Date()))) {
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg, dataVacina, fabricanteVacina);
        } else {
            System.out.println("Sua data ainda não chegou, volte da data certa");
        }


    }
}
