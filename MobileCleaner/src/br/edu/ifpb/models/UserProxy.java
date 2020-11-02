package br.edu.ifpb.models;

import br.edu.ifpb.SQLite.ConnectionSQLite;

import java.util.Date;


public class UserProxy extends ConnectionSQLite {

    UserManager userManager;

    public UserProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    public boolean signUp(User user) {
        user.setDateSingUp(new Date());
        return this.userManager.signUp(user);
    }

}
