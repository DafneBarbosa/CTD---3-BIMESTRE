package com.dafne.backend.Aula10_Log4j.model;

import org.apache.log4j.Logger;

public class Tigre {

    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nome;
    private int idade;

    public Tigre(String nome, int idade, boolean isAlfa) {
        this.nome = nome;
        this.idade = idade;
    }

    public void correr(){
        logger.info("O tigre " + nome + " está correndo!");
    }

    public void ehMaiorQue10() throws Exception{
        if(this.idade > 10){
            logger.info("O tigre " + nome + " tem mais de 10 anos");
        } if(idade < 0){
            logger.error("A idade não pde ser negativa");
            throw new Exception();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
