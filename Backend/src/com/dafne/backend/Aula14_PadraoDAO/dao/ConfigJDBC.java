package com.dafne.backend.Aula14_PadraoDAO.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {

    private String jdbcDriver, dbUrl, nomeUsuario, senha;

    public ConfigJDBC() {
        this.jdbcDriver = "org.H2.Driver";
        this.dbUrl = "jdbc:h2:mem:aula14;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'aula14_create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public ConfigJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Connection conectarComBD(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,nomeUsuario,senha);
            System.out.println("Conecção efetuada com sucesso");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return connection;
        }
    }


}
