package br.edu.ifpb.UserAccess;

import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;

public class UserAccessFactory implements IUserAccessFactory {

    @Override
    public User createUser(String name, String login, String pass, String modelSmartphone) {
        return new User(name, login, pass, modelSmartphone);
    }

    @Override
    public User createUser(String login, String pass) {
        return new User(login, pass);
    }

    @Override
    public SingIn singIn(UserManager userManager, User user) {
        return new SingIn(userManager, user);
    }


    @Override
    public SingUp singUp(User user, UserProxy userProxy) {
        return new SingUp(user, userProxy);
    }

}
