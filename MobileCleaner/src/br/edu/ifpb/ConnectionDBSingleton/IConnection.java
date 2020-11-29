package br.edu.ifpb.ConnectionDBSingleton;

import java.sql.Connection;

public interface IConnection {

    Connection getConnection();

}
