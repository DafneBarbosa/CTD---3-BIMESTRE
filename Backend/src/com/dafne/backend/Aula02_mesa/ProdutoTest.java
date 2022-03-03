package com.dafne.backend.Aula02_mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    CardapioAdulto cardapioAdulto;
    CardapioInfantil cardapioInfantil;
    CardapioVegetariano cardapioVegetariano;

    @BeforeEach
    void doBefore(){
        cardapioAdulto = new CardapioAdulto(12.0);
        cardapioInfantil = new CardapioInfantil(11.0, 7.0);
        cardapioVegetariano = new CardapioVegetariano(14.0,3.0);
    }

    @Test
    void calcularPrecos(){
        Assertions.assertEquals(12.0, cardapioAdulto.precoDeVenda());
        Assertions.assertEquals(18.0, cardapioInfantil.precoDeVenda());
        Assertions.assertEquals(17.14, cardapioVegetariano.precoDeVenda());
    }

    @Test
    void imprimirMontagem(){
        cardapioAdulto.montar();
        cardapioInfantil.montar();
        cardapioVegetariano.montar();
    }


}