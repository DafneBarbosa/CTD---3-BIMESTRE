package com.dafne.backend.Aula05_mesa;

public class ServicoDownloadProxy implements Acesso{
    @Override
    public void acessoUsuario(Usuario usuario) {
        if(usuario.getTipo().equalsIgnoreCase("Premium")){
            System.out.println("Usuário Premium - Permitido Download");
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.acessoUsuario(usuario);
        } else {
            System.out.println("Usuario "+usuario.getTipo()+" "+usuario.getNome()+
                    ": você não possui acesso a downloads. Considere virar Premium!");
        }
    }
}
