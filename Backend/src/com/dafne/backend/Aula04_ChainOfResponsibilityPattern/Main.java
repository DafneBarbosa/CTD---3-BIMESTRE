package com.dafne.backend.Aula04_ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        Mail mail1 = new Mail("aaa@gmail.com","gerencia@colmeia.com", "Ajuda");
        Mail mail2 = new Mail("aaa@gmail.com","ger@colmeia.com", "gerência");

        Mail mail3 = new Mail("aaa@gmail.com","comercial@colmeia.com", "Ajuda");
        Mail mail4 = new Mail("aaa@gmail.com","ger@colmeia.com", "ComerciaL");

        Mail mail5 = new Mail("aaa@gmail.com","tecnica@colmeia.com", "Ajuda");
        Mail mail6 = new Mail("aaa@gmail.com","ger@colmeia.com", "Técnico");

        Mail mail7 = new Mail("aaa@gmail.com","ger@colmeia.com", "Ajuda");

        CheckMail hanbleBase = new Gerencia().setSeguinteDepartamento(new Comercial().setSeguinteDepartamento(new Tecnico()));

        System.out.println("Teste 1: ");
        hanbleBase.processarSolicitacao(mail1);
        System.out.println("Teste 2: ");
        hanbleBase.processarSolicitacao(mail2);
        System.out.println("Teste 3: ");
        hanbleBase.processarSolicitacao(mail3);
        System.out.println("Teste 4: ");
        hanbleBase.processarSolicitacao(mail4);
        System.out.println("Teste 5: ");
        hanbleBase.processarSolicitacao(mail5);
        System.out.println("Teste 6: ");
        hanbleBase.processarSolicitacao(mail6);
        System.out.println("Teste 7: ");
        hanbleBase.processarSolicitacao(mail7);
    }
}
