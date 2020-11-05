package br.edu.ifpb.Model.User;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;

import java.sql.Date;

public class UserProxy {

    UserManager userManager;

    public UserProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    public boolean singUp(IUser user) {
        user.setDateSingUp("");
        user.setPermission("user");
        user.setNotification("");
        return this.userManager.addUser(user);
    }
}
