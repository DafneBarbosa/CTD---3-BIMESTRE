package com.dafne.backend.Aula04_ChainOfResponsibilityPattern;

public class Tecnico extends CheckMail{
    @Override
    public void processarSolicitacao(Mail mail) {
        if(mail.getAssunto().equalsIgnoreCase("Técnico") || mail.getDestino()=="tecnica@colmeia.com"){
            System.out.println("E-mail enviado para o departamento técnico");
        } else if(this.seguinteDepartamento != null){
            this.seguinteDepartamento.processarSolicitacao(mail);
        } else{
            System.out.println("E-mail marcado como SPAM");
        }
    }
}
