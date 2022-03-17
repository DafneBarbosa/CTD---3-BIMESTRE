package com.dafne.backend.Aula14_PadraoDAO.dao.impl;

import com.dafne.backend.Aula14_PadraoDAO.dao.ConfigJDBC;
import com.dafne.backend.Aula14_PadraoDAO.dao.IDao;
import com.dafne.backend.Aula14_PadraoDAO.model.Medicamento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//OBS: seria uma falha se segurança acessar esse método direto do main, por isso vou acessar atraves da classe em service
public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfigJDBC configJDBC;

    public MedicamentoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        Connection connection = configJDBC.conectarComBD();
        Statement statement = null;

        String query = String.format(
                "INSERT INTO medicamento " +
                        "(nome, laboratorio, quantidade, preco) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQuantidade(),
                medicamento.getPreco());

        try{
            statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                medicamento.setId(keys.getInt(1));
            }
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }


}
