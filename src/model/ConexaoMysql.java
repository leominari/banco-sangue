/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leo_m
 *
 */
public class ConexaoMysql {

    public static String status = "Não conectou...";

    public ConexaoMysql() {

    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "bancosangue";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("STATUS-->Conectado com sucesso!");
            } else {
                status = ("STATUS-->Não foi possivel realizar a conexão.");
            }

            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado não foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    public static String statusConection() {

        return status;

    }

    public static boolean FecharConexao() {

        try {
            ConexaoMysql.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();

        return ConexaoMysql.getConexaoMySQL();

    }

    public ResultSet exQuery(String query) {

        try {
            Connection connection = getConexaoMySQL();
            Statement stmt = connection.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery(query);
            return rs;

        } catch (SQLException e) {
            System.err.println("ERROU ");
            System.err.println(e.getMessage());
        }
        return null;
    }
    
        public boolean upQuery(String query) {

        try {
            Connection connection = getConexaoMySQL();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            return true;

        } catch (SQLException e) {
            System.err.println("ERROU ");
            System.err.println(e.getMessage());
            return false;
        }
    }
}
