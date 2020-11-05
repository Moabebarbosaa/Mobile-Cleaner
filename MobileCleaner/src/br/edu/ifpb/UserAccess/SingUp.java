package br.edu.ifpb.UserAccess;


import br.edu.ifpb.Model.User.IUser;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserProxy;

public class SingUp {

    private final IUser user;

    UserProxy userProxy;

    public SingUp(IUser user, UserProxy userProxy) {
        this.user = user;
        this.userProxy = userProxy;
    }

    public boolean register() {
        return this.userProxy.singUp(this.user);
    }
}
