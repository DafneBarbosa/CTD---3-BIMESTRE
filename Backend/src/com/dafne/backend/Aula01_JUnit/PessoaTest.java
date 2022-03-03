package com.dafne.backend.Aula01_JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8, pessoa9, pessoa10;
    List<String> colecao = new ArrayList<String>();

    //Antes dos testes vamos cadastrar informações
    @BeforeEach
    void doBefore(){
        pessoa1 = new Pessoa("João", LocalDate.of(1992,5,3));
        pessoa2 = new Pessoa("Ana", LocalDate.of(1987,1,25));
        pessoa3 = new Pessoa("Lais", LocalDate.of(1949,4,30));
        pessoa4 = new Pessoa("Fe", LocalDate.of(2010,7,12));
        pessoa5 = new Pessoa("Enzo", LocalDate.of(2018,2,17));

        pessoa6 = new Pessoa("Lucas", LocalDate.of(2004,3,27));
        pessoa7 = new Pessoa("Amanda", LocalDate.of(2012,12,16));
        pessoa8 = new Pessoa("Giovane", LocalDate.of(2020,11,3));

        pessoa9 = new Pessoa("Dafne", LocalDate.of(1991,9,21));
        pessoa10 = new Pessoa("Maria Cristina", LocalDate.of(2004,1,7));
    }

    //Teste - imprimindo pessoas
    @Test
    void imprimirObjetos(){
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
        System.out.println(pessoa5.toString());
        System.out.println(pessoa6.toString());
        System.out.println(pessoa7.toString());
        System.out.println(pessoa8.toString());
        System.out.println(pessoa9.toString());
        System.out.println(pessoa10.toString());
    }

    @Test
    void imprimirColecao(){
        System.out.println(Pessoa.getColecao());
    }


}