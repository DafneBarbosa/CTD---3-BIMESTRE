package com.dafne.backend.Aula02_TemplateMethodPattern;

public class Contratado extends Funcionario{


    public Contratado(String nome, String sobrenome, String numeroConta) {
        super(nome, sobrenome, numeroConta);
    }

    @Override
    public double calcularSaldo() {
        return 0;
    }

    @Override
    public void imprimirRecibo(double quantia) {

    }

    @Override
    public void depositar(double quantia) {

    }
}
