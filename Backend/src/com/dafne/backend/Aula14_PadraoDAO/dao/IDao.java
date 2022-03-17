package com.dafne.backend.Aula14_PadraoDAO.dao;

import java.sql.SQLException;

public interface IDao <T> {

    public T salvar(T t);

}
