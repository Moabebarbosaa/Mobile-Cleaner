package br.edu.ifpb.Proxy;

import br.edu.ifpb.Database.ConnectionSQLite;
import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

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
