package com.dafne.backend.Aula08_FacadePattern.service.impl;

import com.dafne.backend.Aula08_FacadePattern.model.Cartao;

public class ApiCartao {

    public int desconto(Cartao cartao){
        if(cartao.getBanco().equalsIgnoreCase("Star Bank")){
            return 20;
        } else {
            return 0;
        }
    }

}
