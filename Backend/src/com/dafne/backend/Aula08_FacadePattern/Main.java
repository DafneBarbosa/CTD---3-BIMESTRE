package com.dafne.backend.Aula08_FacadePattern;

import com.dafne.backend.Aula08_FacadePattern.model.Cartao;
import com.dafne.backend.Aula08_FacadePattern.model.Produto;
import com.dafne.backend.Aula08_FacadePattern.service.impl.FacadeDesconto;

public class Main {
    public static void main(String[] args) {

        Cartao cartao1 = new Cartao("123","Star Bank");
        Cartao cartao2 = new Cartao("456","Itau");
        Produto produto1 = new Produto("coca-cola", "refrigerante");
        Produto produto2 = new Produto("tomate pelado", "lata");

        FacadeDesconto facade1 = new FacadeDesconto();
        int desconto1 = facade1.desconto(cartao1, produto2, 10);
        System.out.println("Desconto 1 = " + desconto1 + "%");

        int desconto2 = facade1.desconto(cartao2, produto1, 15);
        System.out.println("Desconto 2 = " + desconto2 + "%");

    }
}
