package com.dafne.backend.Aula06_mesa.model;

public class Ip {

    private int n1,n2,n3,n4;

    public Ip(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public String getPais(){
        if(this.n1<=49){
            return "Argentina";
        } else if(this.n1<=99){
            return "Brasil";
        } else {
            return "Colombia";
        }
    }



}
