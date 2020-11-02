package br.edu.ifpb.models;

import br.edu.ifpb.Database.ConnectionSQLite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserManager extends ConnectionSQLite {


    public boolean signUp(User user) {

        if (!validationSingUP(user)) return false;

        if (!connect()) return false;

        String sql = "INSERT INTO users (" +
                "name, " +
                "login, " +
                "pass, " +
                "admin, " +
                "notification, " +
                "modelSmartphone) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = createPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);


        try {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.setString(4, user.getAdmin().toString());
            preparedStatement.setString(5, user.getNotification());
            preparedStatement.setString(6, user.getModelSmartphone());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        disconnect();
        return true;
    }

    public boolean signIn(String login, String pass) {
        if (!connect()) return false;

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, "
                + "login, "
                + "pass "
                + "FROM users "
                + "WHERE login = '" + login + "' AND "
                + "pass = '" + pass + "'";

        preparedStatement = createPreparedStatement(sql);

        try {
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                disconnect();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


    public boolean validationSingUP(User user) {
        if (user.getName().equals("")) return false;

        else if (user.getLogin().equals("")) return false;

        else if (user.getPass().equals("")) return false;

        else return !user.getModelSmartphone().equals("");
    }

    public boolean checkAdmin(String login, String pass) {
        if (!connect()) return false;

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT admin "
                + "FROM users "
                + "WHERE login = '" + login + "' AND "
                + "pass = '" + pass + "'";

        preparedStatement = createPreparedStatement(sql);

        try {
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                if (resultSet.getInt(1) == 1) {
                    return true;
                }
                return false;

            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                disconnect();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public List<User> userList() {

        List<User> listUser = new ArrayList<>();
        User user = new User();

        connect();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM users";

        try {
            preparedStatement = createPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setLogin(resultSet.getString(3));
                user.setPass(resultSet.getString(4));
                user.setAdmin(resultSet.getInt(5));
                user.setNotification(resultSet.getString(6));
                user.setModelSmartphone(resultSet.getString(7));
                listUser.add(user);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        disconnect();
        return listUser;
    }

}