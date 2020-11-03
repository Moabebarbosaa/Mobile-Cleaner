package br.edu.ifpb.UserAccess;


import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;

public class SingIn {

    UserManager userManager = new UserManager();
    private User user;

    public SingIn(User user) {
        this.user = user;
    }

    public boolean enter() {
        if(this.userManager.verifyUser(this.user)) return true;
        return false;
    }

}