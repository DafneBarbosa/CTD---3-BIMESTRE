package com.dafne.backend.Aula06_mesa;

import com.dafne.backend.Aula06_mesa.model.Filme;
import com.dafne.backend.Aula06_mesa.model.Ip;
import com.dafne.backend.Aula06_mesa.services.GradeDeFilmesProxy;
import com.dafne.backend.Aula06_mesa.services.SerieProxy;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Harry Potter","Brasil","xxxx.hp");
        Filme filme2 = new Filme("Vingadores","Argentina","xxxx.v");
        Filme filme3 = new Filme("Batman","Colombia","xxxx.b");

        Ip ip1 = new Ip(2);
        Ip ip2 = new Ip(53);
        Ip ip3 = new Ip(112);

        GradeDeFilmesProxy servico1 = new GradeDeFilmesProxy(ip1);
        try {
            servico1.getFilme("Vingadores");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        GradeDeFilmesProxy servico2 = new GradeDeFilmesProxy(ip2);
        try {
            servico2.getFilme("Harry Potter");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        GradeDeFilmesProxy servico3 = new GradeDeFilmesProxy(ip3);
        try {
            servico3.getFilme("Batman");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            servico3.getFilme("Vingadores");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        SerieProxy servico4 = new SerieProxy();
        try {
            servico4.getSerie("Arcane");
            servico4.getSerie("Dexter");
            servico4.getSerie("Witcher");
            servico4.getSerie("OA");
            servico4.getSerie("Dark");
            servico4.getSerie("Sinner");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
