package br.edu.ifpb.UserAccess;


import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;

public class SingUp {

    private final User user;

    UserProxy userProxy;

    public SingUp(User user, UserProxy userProxy) {
        this.user = user;
        this.userProxy = userProxy;
    }

    public boolean register() {
        return this.userProxy.singUp(this.user);
    }
}
