package com.dafne.backend.Aula05_mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario usuario1, usuario2, usuario3;
    ServicoDownloadProxy servico1;

    @BeforeEach
    void doBefore(){
        usuario1 = new Usuario("Dafne", "premium");
        usuario2 = new Usuario("Maria", "free");

        servico1 = new ServicoDownloadProxy();
    }

    @Test
    void fazerDownload(){
        servico1.acessoUsuario(usuario1);
        servico1.acessoUsuario(usuario2);
    }

}