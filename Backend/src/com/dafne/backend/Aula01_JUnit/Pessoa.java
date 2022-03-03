package com.dafne.backend.Aula01_JUnit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private int idade;

    static List<String> colecao = new ArrayList<>();

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;

        calcularIdade();
        adicionarNome();
    }

    private void calcularIdade(){
        this.idade = Period.between(this.nascimento, LocalDate.now()).getYears();
    }

    private void adicionarNome(){
        int tamanhoNome = this.nome.length();
        if(tamanhoNome>4 && this.idade>=18){
            colecao.add(this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

        adicionarNome();
    }

    public int getIdade() {
        return idade;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;

        calcularIdade();
        adicionarNome();
    }

    public static List<String> getColecao() {
        System.out.println("\nPessoas maiores de idade e nome com mais de 4 letras:");
        return colecao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", idade=" + idade +
                '}';
    }

}
