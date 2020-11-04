package br.edu.ifpb.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory implements IConnectionFactory{

    @Override
    public Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:" + System.getenv("SQLiteBDPath") + "\\database.db";

            return DriverManager.getConnection(url);
        } catch (SQLException | ClassNotFoundException ex) {
            throw  new RuntimeException(ex);
        }
    }

}

