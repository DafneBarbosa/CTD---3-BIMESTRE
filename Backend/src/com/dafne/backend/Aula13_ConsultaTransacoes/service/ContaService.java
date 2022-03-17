package com.dafne.backend.Aula13_ConsultaTransacoes.service;

import com.dafne.backend.Aula13_ConsultaTransacoes.model.Conta;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;

public class ContaService {

    private static final Logger LOGGER = Logger.getLogger(ContaService.class);
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS conta; "
            + "CREATE TABLE conta ("
            + "id INT PRIMARY KEY, "
            + "nome VARCHAR(64) NOT NULL, "
            + "numConta VARCHAR(64) NOT NULL, "
            + "saldo double)";

    private static final String SQL_INSERT = "INSERT INTO conta"
            + "(id, nome, numConta, saldo) "
            + "VALUES (?, ?, ?, ?);";

    private static final String SQL_UPDATE = "UPDATE conta SET saldo = ?" + "WHERE id = ?";



    public static void main(String[] args) throws Exception{

        BasicConfigurator.configure();

        Conta c1 = new Conta(1, "Bill", "5522-3",0);

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando a tabela conta");
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement inserir = connection.prepareStatement(SQL_INSERT);
            inserir.setInt(1, c1.getId()); //colocar o id da conta c1 no primeiro parâmetro da minha expressão SQL_INSERT
            inserir.setString(2, c1.getNome()); //colocar o nome da conta c1 no segundo parâmetro da minha expressão SQL_INSERT
            inserir.setString(3, c1.getNumConta());
            inserir.setDouble(4, c1.getSaldo());
            LOGGER.info("Inserindo a conta do Bill no banco");
            inserir.execute();

            mostraDadosDasContas(connection);

            c1.deposita(10.0);
            PreparedStatement atualizar = connection.prepareStatement(SQL_UPDATE);
            atualizar.setDouble(1, c1.getSaldo());
            atualizar.setInt(2, c1.getId());
            atualizar.execute();

            mostraDadosDasContas(connection);

            mostrarSaldos(connection, 1);

        } catch(Exception e){
            LOGGER.error("Erro de acesso ao BD: " + e);
        } finally {
            if(connection==null){
                return;
            }
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:aula13", "sa", "");
    }

    public static void mostraDadosDasContas(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM conta;";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        LOGGER.info("Exibindo contas: ");
        while(rs.next()){
            System.out.println("ID: " + rs.getInt(1) +
                    " | Nome: " + rs.getString(2) +
                    " | NumConta: " + rs.getString(3) +
                    " | Saldo: " + rs.getDouble(4));
        }
    }

    public static void mostrarSaldos(Connection connection, int id) throws Exception {
        String consultaSql = "SELECT saldo FROM conta WHERE id = "+id+";";
        Statement consultar = connection.createStatement();
        ResultSet rs = consultar.executeQuery(consultaSql);
        while(rs.next()){
            System.out.println("Saldo: " + rs.getDouble(1));
        }
    }

}
