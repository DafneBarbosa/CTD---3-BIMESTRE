package com.dafne.backend.Aula04_ChainOfResponsibilityPattern;

public abstract class CheckMail {

    protected CheckMail seguinteDepartamento;

    public abstract void processarSolicitacao(Mail mail);

    public CheckMail setSeguinteDepartamento(CheckMail seguinteDepartamento){
        this.seguinteDepartamento = seguinteDepartamento;
        return this;
    }


}
