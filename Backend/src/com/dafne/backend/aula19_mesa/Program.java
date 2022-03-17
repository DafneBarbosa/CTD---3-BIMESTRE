package com.dafne.backend.aula19_mesa;

import com.dafne.backend.aula19_mesa.model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Criando e salvando contatos em uma lista
        List<Contato> contatosSalvos = new ArrayList<>();
        Contato contato1 = new Contato("Dafne","dafne@gmail.com","99826-7262");
        Contato contato2 = new Contato("Felipe","felipe@gmail.com","99962-5272");
        Contato contato3 = new Contato("Maria","maria@gmail.com","99736-7262");
        contatosSalvos.add(contato1);
        contatosSalvos.add(contato2);
        contatosSalvos.add(contato3);

        //Salvando contatos em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("aula19_mesa_OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contatosSalvos);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Lendo contatos de um arquivo
        List<Contato> contatosLidos = new ArrayList<>();
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("aula19_mesa_OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            contatosLidos = (ArrayList) ois.readObject(); //fazendo casting para ArrayList
        } catch (Exception e){
            e.printStackTrace();
        }

        //Exibindo contatos lidos
        for(Contato contato:contatosLidos){
            System.out.println(contato);
        }

    }
}
