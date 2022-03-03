package com.dafne.backend.Aula01_mesa;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*this.raio*Math.PI;
    }
}
