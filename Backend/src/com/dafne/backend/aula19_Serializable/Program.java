package com.dafne.backend.aula19_Serializable;

import com.dafne.backend.aula19_Serializable.model.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro("Bombom","Cocker","Porto Alegre", 18);
        Cachorro cachorro2 = new Cachorro("Juniper","Shiba","São Paulo", 1);
        Cachorro cachorro3 = new Cachorro("Buma","SRD","São Paulo", 3);
        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);

        //Salvar coleção de cachorros em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("aula19_OutputFile.txt"); //criando um arquivo vazio
            ObjectOutputStream oos = new ObjectOutputStream(fo); //criando um objeto de saída para escrever no arquivo
            oos.writeObject(cachorros); //pedindo para o objeto de saída escrever minha lista de cachorros no arquivo
        } catch (Exception e){
            e.printStackTrace();
        }

        //Lendo de um arquivo
        List<Cachorro> cachorros2 = new ArrayList<>();
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("aula19_OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            cachorros2 = (ArrayList) ois.readObject(); //fazendo casting para ArrayList
        } catch (Exception e){
            e.printStackTrace();
        }

        //Mostrando a lista de cachorros2
        for(Cachorro cachorro:cachorros2){
            System.out.println(cachorro);
        }

    }
}
