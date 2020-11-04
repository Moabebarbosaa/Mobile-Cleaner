package br.edu.ifpb.UserAccess;

import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;

public interface IUserAccessFactory {

    public User createUser(String name, String login, String pass, String modelSmartphone);

    public User createUser(String login, String pass);

    public SingIn singIn(UserManager userManager, User user);

    public SingUp singUp(User user, UserProxy userProxy);

}