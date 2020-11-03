package br.edu.ifpb.UserAccess;

import br.edu.ifpb.Model.User.User;

public interface IUserAccessFactory {

    public User createUser(String name, String login, String pass, String modelSmartphone);

    public User createUser(String login, String pass);

    public SingIn singIn(User user);

    public SingUp singUp(User user);

}
