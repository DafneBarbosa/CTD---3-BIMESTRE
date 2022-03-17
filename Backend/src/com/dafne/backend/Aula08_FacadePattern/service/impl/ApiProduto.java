package com.dafne.backend.Aula08_FacadePattern.service.impl;


import com.dafne.backend.Aula08_FacadePattern.model.Produto;

public class ApiProduto {

    public int desconto(Produto produto){
        if(produto.getTipo().equalsIgnoreCase("lata")){
            return 10;
        } else {
            return 0;
        }
    }

}
