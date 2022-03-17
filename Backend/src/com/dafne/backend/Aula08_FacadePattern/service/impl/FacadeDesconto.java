package com.dafne.backend.Aula08_FacadePattern.service.impl;

import com.dafne.backend.Aula08_FacadePattern.model.Cartao;
import com.dafne.backend.Aula08_FacadePattern.model.Produto;
import com.dafne.backend.Aula08_FacadePattern.service.IFacadeDesconto;

public class FacadeDesconto implements IFacadeDesconto {

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto(){
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int desconto = this.apiCartao.desconto(cartao) + this.apiProduto.desconto(produto) + this.apiQuantidade.desconto(quantidade);
        return desconto;
    }

}
