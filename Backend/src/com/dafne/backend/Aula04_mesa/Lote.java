package com.dafne.backend.Aula04_mesa;

public class Lote extends CheckQuality{

    @Override
    public void processarSolicitacao(Artigo artigo) {
        if(artigo.getLote()<10){
            System.out.println("Lote");
        } else if(this.seguinteCategoria != null){
            this.seguinteCategoria.processarSolicitacao(artigo);
        }
    }
}
