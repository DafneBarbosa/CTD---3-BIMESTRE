package com.dafne.backend.Aula01_mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo1;

    @BeforeEach
    void doBefore(){
        circulo1 = new Circulo(5);

    }

    @Test
    void calcularPerimetro(){
        Assertions.assertEquals(2 * Math.PI * 5, circulo1.calcularPerimetro());
    }

}