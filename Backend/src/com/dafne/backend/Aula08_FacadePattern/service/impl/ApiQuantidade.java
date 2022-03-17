package com.dafne.backend.Aula08_FacadePattern.service.impl;

import com.dafne.backend.Aula08_FacadePattern.model.Produto;

public class ApiQuantidade {

    public int desconto(int quantidade){
        if(quantidade>12){
            return 15;
        } else {
            return 0;
        }
    }

}
