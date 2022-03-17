package com.dafne.backend.aula20.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private String cnpj;
    private String razaoSocial;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(){}

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
