package com.dafne.backend.Aula09.test;

import com.dafne.backend.Aula09.model.Quadrado;
import com.dafne.backend.Aula09.model.Triangulo;
import com.dafne.backend.Aula09.service.FlyweightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2() {

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("azul");
        triangulo2.setTamanho(6);

        assertEquals(triangulo.getCor(), "vermelho");

        assertEquals(triangulo1.getTamanho(), 4);

        assertEquals(FlyweightFactory.trianguloMap.size() == 2, true);

    }

    void getQuadradoComTamanho2() {

        Quadrado quadrado = FlyweightFactory.obterQuadrado(4);
        quadrado.setCor("verde");

        Quadrado quadrado1 = FlyweightFactory.obterQuadrado(4);
        quadrado1.setCor("azul");

        Quadrado quadrado2 = FlyweightFactory.obterQuadrado(2);
        quadrado2.setCor("verde");

        assertEquals(quadrado.getCor(), "verde");

        assertEquals(quadrado.getTamanho(), 4);

        assertEquals(FlyweightFactory.trianguloMap.size() == 2, true);

    }

}