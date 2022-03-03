package com.dafne.backend.Aula04_ChainOfResponsibilityPattern;

public class Comercial extends CheckMail{
    @Override
    public void processarSolicitacao(Mail mail) {
        if(mail.getAssunto().equalsIgnoreCase("ComerciaL") || mail.getDestino()=="comercial@colmeia.com"){
            System.out.println("E-mail enviado para o departamento comercial");
        } else if(this.seguinteDepartamento != null){
            this.seguinteDepartamento.processarSolicitacao(mail);
        } else{
            System.out.println("E-mail marcado como SPAM");
        }
    }
}
