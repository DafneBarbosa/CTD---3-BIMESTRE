package com.dafne.backend.Aula15.dao.impl;



import com.dafne.backend.Aula15.dao.IDao;
import com.dafne.backend.Aula15.dao.config.ConfigJDBC;
import com.dafne.backend.Aula15.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDaoH2 implements IDao<Endereco> {

    private ConfigJDBC configJDBC;

    public EnderecoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {

        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format(
                "INSERT INTO enderecos " +
                        "(rua, numero, cidade, bairro) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getBairro()
        );

        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if(keys.next())
                endereco.setId(keys.getInt(1));
            System.out.println(endereco.getId());
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return endereco;
    }

}

