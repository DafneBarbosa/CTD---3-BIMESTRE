package com.dafne.backend.Aula01_mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    Quadrado quadrado1;

    @BeforeEach
    void doBefore(){
        quadrado1 = new Quadrado(2);
    }

    @Test
    void calcularPerimetro(){
        Assertions.assertEquals(4*2, quadrado1.calcularPerimetro());
    }

}