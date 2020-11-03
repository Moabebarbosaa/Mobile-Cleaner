package br.edu.ifpb.UserAccess;

import br.edu.ifpb.Model.User.User;

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
    public SingIn singIn(User user) {
        return new SingIn(user);
    }


    @Override
    public SingUp singUp(User user) {
        return new SingUp(user);
    }

}
