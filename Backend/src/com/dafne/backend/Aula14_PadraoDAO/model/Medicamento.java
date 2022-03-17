package com.dafne.backend.Aula14_PadraoDAO.model;

public class Medicamento {

    private Integer id, quantidade;
    private String nome, laboratorio;
    private Double preco;

    public Medicamento() {
    }

    public Medicamento(int quantidade, String nome, String laboratorio, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", preco=" + preco +
                '}';
    }
}
