package com.dafne.backend.Aula04_mesa;

public class Embalagem extends CheckQuality{
    @Override
    public void processarSolicitacao(Artigo artigo) {
        if(artigo.getPeso()<10){
            System.out.println("Peso");
        } else if(this.seguinteCategoria != null){
            this.seguinteCategoria.processarSolicitacao(artigo);
        }
    }
}
