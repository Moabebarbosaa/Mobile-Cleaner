package br.edu.ifpb.UserAccess;

import br.edu.ifpb.Model.User.IUser;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Model.User.UserProxy;

public interface IUserAccessFactory {

    public IUser createUser(String name, String login, String pass, String modelSmartphone);

    public IUser createUser(String login, String pass);

    public SingIn singIn(UserManager userManager, IUser user);

    public SingUp singUp(IUser user, UserProxy userProxy);

}
