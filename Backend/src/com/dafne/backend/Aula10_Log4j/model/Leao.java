package com.dafne.backend.Aula10_Log4j.model;

import org.apache.log4j.Logger;

public class Leao {

    private static final Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;
    private boolean isAlfa;

    public Leao(String nome, int idade, boolean isAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.isAlfa = isAlfa;
    }

    public void correr(){
        logger.info("O leão " + nome + " está correndo!");
    }

    public void ehMaiorQue10() throws Exception{
        if(this.idade > 10 && isAlfa()){
            logger.info("O leão " + nome + " tem mais de 10 anos");
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

    public boolean isAlfa() {
        return isAlfa;
    }

    public void setAlfa(boolean alfa) {
        isAlfa = alfa;
    }
}
