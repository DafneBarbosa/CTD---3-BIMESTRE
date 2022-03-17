package com.dafne.backend.aula20;

import com.dafne.backend.aula19_mesa.model.Contato;
import com.dafne.backend.aula20.model.Empresa;
import com.dafne.backend.aula20.model.Funcionario;

import java.io.*;


public class Program {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Dafne", "Barbosa", "63827363", 12500.2);
        Funcionario funcionario2 = new Funcionario("Felipe", "Marques", "67826262", 7200.3);
        Funcionario funcionario3 = new Funcionario("Maria", "Silva", "183092523", 15700.6);

        Empresa empresa = new Empresa("26171827252", "Empresa 1");
        empresa.addFuncionario(funcionario1);
        empresa.addFuncionario(funcionario2);
        empresa.addFuncionario(funcionario3);

        //Salvando em um arquivo
        System.out.println("\nSalvando e lendo do arquivo com ObjectStream:");
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("aula20_OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(empresa);
        } catch (Exception e){
            System.out.println(e.getMessage());;
        }

        //Lendo de um arquivo
        Empresa empresaLida = new Empresa();
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("aula20_OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            empresaLida = (Empresa) ois.readObject(); //fazendo casting para ArrayList
        } catch (Exception e){
            e.printStackTrace();
        }

        //Exibindo contatos lidos
        System.out.println(empresaLida);


        //Lendo o arquivo import
        System.out.println("\nLendo o arquivo import:");
        FileInputStream fi2 = null;
        try {
            fi2 = new FileInputStream("aula20_Import.txt");
            int i = fi2.read();
            while(i != -1){
                System.out.print((char)i);
                i = fi2.read();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        //Salvando variaveis do arquivo import
        System.out.println("\n\nSalvando variáveis com o arquivo import:");
        Funcionario funcionario;
        Empresa empresa3 = new Empresa("73627531253", "Empresa3");
        String nome = "";
        Double salario = 0.0;
        int contador;

        try {
            fi2 = new FileInputStream("aula20_Import.txt");
            int i = fi2.read();


            while (i != -1) {
                funcionario = new Funcionario();
                contador = 1;
                while (contador <= 4) {
                    while (i != 59 && i != -1 && i != 10) {
                        nome += (char) i;
                        i = fi2.read();
                    }
                    if (contador == 1) funcionario.setNome(nome);
                    if (contador == 2) funcionario.setSobrenome(nome);
                    if (contador == 3) funcionario.setDocumento(nome);
                    if (contador == 4){
                        salario = Double.parseDouble(nome);
                        funcionario.setSalario(salario);
                    }

                    nome = "";
                    i = fi2.read();
                    contador++;
                }
                System.out.println(funcionario);
                empresa3.addFuncionario(funcionario);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(empresa3);


    }
}
