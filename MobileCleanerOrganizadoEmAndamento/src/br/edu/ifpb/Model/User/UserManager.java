package br.edu.ifpb.Model.User;
import br.edu.ifpb.ConnectionDB.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserManager {

    private Connection connection;

    public UserManager() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Boolean addUser(User user) {
        String sql = "INSERT INTO users(" +
                "name, " +
                "login, " +
                "pass, " +
                "permission, " +
                "notification, " +
                "modelSmartphone, " +
                "dateSingUp) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.setString(4, user.getPermission());
            preparedStatement.setString(5, user.getNotification());
            preparedStatement.setString(6, user.getModelSmartphone());
            preparedStatement.setDate(7, user.getDateSingUp());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public boolean verifyUser(User user) {

        ResultSet resultSet = null;

        String sql = "SELECT id, "
                + "login, "
                + "pass "
                + "FROM users "
                + "WHERE login = '" + user.getLogin() + "' AND "
                + "pass = '" + user.getPass() + "'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                preparedStatement.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException u) {
            u.printStackTrace();
            return false;
        } finally {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean checkAdmin(User user) {
        ResultSet resultSet = null;

        String sql = "SELECT permission"
                + " FROM users "
                + "WHERE login = '" + user.getLogin() + "' AND "
                + "pass = '" + user.getPass() + "'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString(1).equals("admin");
            } else {
                return false;
            }
        } catch (SQLException u) {
            u.printStackTrace();
            return false;
        } finally {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}