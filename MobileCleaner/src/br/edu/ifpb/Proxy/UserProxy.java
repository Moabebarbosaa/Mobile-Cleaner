package br.edu.ifpb.Proxy;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;

import java.sql.Date;

public class UserProxy {

    UserManager userManager;

    public UserProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    public boolean singUp(User user) {
        user.setDateSingUp(new Date(2020,11,3));
        user.setPermission("user");
        return this.userManager.addUser(user);
    }
}
