package com.dafne.backend.aula19_Serializable.model;

import java.io.Serializable;

public class Cachorro implements Serializable {

    private String nome;
    private String raca;
    private String endereco;
    private Integer idade;

    public Cachorro() {
    }

    public Cachorro(String nome, String raca, String endereco, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }
}
