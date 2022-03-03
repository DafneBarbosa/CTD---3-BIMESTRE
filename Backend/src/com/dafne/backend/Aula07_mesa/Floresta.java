package com.dafne.backend.Aula07_mesa;

import java.util.ArrayList;

public class Floresta {
    public static void main(String[] args) {

        final ArvoreFactory arvore = new ArvoreFactory();

        ArrayList<Arvore> arvores = new ArrayList<Arvore>();

        Arvore arvore1 = arvore.getArvore("Ornamental");
        arvore1.setAltura(200);
        arvore1.setLargura(400);
        arvore1.setCor("verde");
        arvores.add(arvore1);

        Arvore arvore2 = arvore.getArvore("Frutifera");
        arvore2.setAltura(500);
        arvore2.setLargura(300);
        arvore2.setCor("vermelho");
        arvores.add(arvore2);

        /* Arvore arvore3 = arvore.getArvore("Florifera");
        arvore3.setAltura(100);
        arvore3.setLargura(200);
        arvore3.setCor("azul"); */

        for (int i=3; i<=499; i++){
            arvores.add(arvore.getArvore("Ornamental"));
        }

        for (int i=500; i<=1000; i++){
            arvores.add(arvore.getArvore("Frutifera"));
        }

        /*System.out.println("Floresta = [ ");
        for(int i=0; i<arvores.size();i++){
            System.out.println(arvores.get(i)+" , ");
        }
        System.out.println(" ]");*/

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
