package com.dafne.backend.Aula15.service;

import com.dafne.backend.Aula15.dao.IDao;
import com.dafne.backend.Aula15.model.Endereco;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoIDao.salvar(endereco);
        return endereco;
    }
    //return enderecoIDao.salvar(endereco);
}
