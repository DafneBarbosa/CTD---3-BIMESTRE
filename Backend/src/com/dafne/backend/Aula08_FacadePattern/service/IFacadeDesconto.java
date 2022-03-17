package com.dafne.backend.Aula08_FacadePattern.service;

import com.dafne.backend.Aula08_FacadePattern.model.Cartao;
import com.dafne.backend.Aula08_FacadePattern.model.Produto;

public interface IFacadeDesconto {

    public int desconto(Cartao cartao, Produto produto, int quantidade);

}
