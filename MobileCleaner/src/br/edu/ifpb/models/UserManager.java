package br.edu.ifpb.models;

import br.edu.ifpb.connectionSQLite.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserManager extends ConnectionFactory {

    public User user;

    public boolean signUp(User user) {
        connect();
        String sql = "INSERT INTO users (" +
                "name, " +
                "login, " +
                "pass, " +
                "modelSmartphone, " +
                "companyName) " +
                "VALUES (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = createPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);

        try {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.setString(4, user.getModelSmartphone());
            preparedStatement.setString(5, user.getCompanyName());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        disconnect();
        return true;
    }

    public boolean signIn(String login, String pass) {



        return true;
    }


    public boolean validation() {


        return true;
    }

}