package br.edu.ifpb.UserBuilder;


import br.edu.ifpb.models.User;

import java.util.Date;

public interface IUserBuilder {

    public IUserBuilder setName(String name);
    public IUserBuilder setLogin(String login);
    public IUserBuilder setPass(String pass);
    public IUserBuilder setModelSmartphone(String modelSmartphone);


    public User builder();

}
