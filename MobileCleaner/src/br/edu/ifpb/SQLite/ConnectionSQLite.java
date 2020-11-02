package br.edu.ifpb.SQLite;

import java.sql.*;

public class ConnectionSQLite {


    Connection connection = null;

    public boolean connect() {

        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:"+System.getenv("SQLiteBDPath")+"\\database.db";
            this.connection = DriverManager.getConnection(url);

            System.out.println("Conectado" + this.connection.toString());

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return false;
        }


        return true;
    }

    public boolean disconnect() {
        try {
            if (!this.connection.isClosed()) {
                this.connection.close();
            }
            System.out.println("Desconectado");
        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }


    public Statement createStatement() {
        try {
            return this.connection.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }


    public PreparedStatement createPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS) {
        try {
            System.out.println("Executando");
            return connection.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public PreparedStatement createPreparedStatement(String sql) {
        try {
            return this.connection.prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }

}
