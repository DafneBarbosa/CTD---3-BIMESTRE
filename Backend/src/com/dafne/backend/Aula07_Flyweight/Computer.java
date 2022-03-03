package com.dafne.backend.Aula07_Flyweight;

public class Computer {

    private int ram, hd;
    private static int contador;

    public Computer(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("Computadores registrados: "+contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}
