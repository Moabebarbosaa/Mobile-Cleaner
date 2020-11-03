package br.edu.ifpb.ConnectionDB;

import java.sql.Connection;

public interface IConnectionFactory {

    public Connection getConnection();

}
