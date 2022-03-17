package com.dafne.backend.Aula15.test;


import com.dafne.backend.Aula15.dao.config.ConfigJDBC;
import com.dafne.backend.Aula15.dao.impl.EnderecoDaoH2;
import com.dafne.backend.Aula15.model.Endereco;
import com.dafne.backend.Aula15.service.EnderecoService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class EnderecoServiceTest {

    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);

    private EnderecoService enderecoService = new EnderecoService(
            new EnderecoDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarEnderecoNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Endereco endereco1 = new Endereco(
                "Av. Eldorado", "2154",
                "São Paulo", "Morumbi");
        enderecoService.salvar(endereco1);
        Endereco endereco2 = new Endereco(
                "Av. Eldorado", "2154",
                "São Paulo", "Morumbi");
        enderecoService.salvar(endereco2);
    }
}
