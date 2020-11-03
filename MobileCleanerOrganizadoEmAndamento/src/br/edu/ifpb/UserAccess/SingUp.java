package br.edu.ifpb.UserAccess;


import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;

public class SingUp {

    private final User user;

    UserProxy userProxy = new UserProxy(new UserManager());

    public SingUp(User user) {
        this.user = user;
    }

    public boolean register() {
        return this.userProxy.singUp(this.user);
    }
}
