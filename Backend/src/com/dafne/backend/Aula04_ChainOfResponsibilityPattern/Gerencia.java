package com.dafne.backend.Aula04_ChainOfResponsibilityPattern;

public class Gerencia extends CheckMail{
    @Override
    public void processarSolicitacao(Mail mail) {
        if(mail.getAssunto().equalsIgnoreCase("Gerência") || mail.getDestino()=="gerencia@colmeia.com"){
            System.out.println("E-mail enviado para o departamento gerencial");
        } else if(this.seguinteDepartamento != null){
            this.seguinteDepartamento.processarSolicitacao(mail);
        } else{
            System.out.println("E-mail marcado como SPAM");
        }
    }
}
