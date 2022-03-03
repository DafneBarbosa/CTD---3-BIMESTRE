package com.dafne.backend.Aula05_mesa;

public class ServicoDownload implements Acesso{
    @Override
    public void acessoUsuario(Usuario usuario) {
        System.out.println("Usuario "+usuario.getTipo()+" "+usuario.getNome()+": download feito com sucesso");
    }
}
