package br.edu.ifpb.UserBuilder;

import br.edu.ifpb.FactoryMethod.CadastroModel;
import br.edu.ifpb.models.User;

import java.util.Date;

public class UserBuilder implements IUserBuilder{

    private String name;
    private String login;
    private String pass;
    private String modelSmartphone;

    @Override
    public IUserBuilder setName(String name) {
        this.name = name;
        return this;
    }



    @Override
    public IUserBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    @Override
    public IUserBuilder setPass(String pass) {
        this.pass = pass;
        return this;
    }


    @Override
    public IUserBuilder setModelSmartphone(String modelSmartphone) {
        this.modelSmartphone = modelSmartphone;
        return this;
    }


    @Override
    public User builder() {
        CadastroModel cadastroModel = new CadastroModel();
        User user = cadastroModel.createUser(this.name, this.login, this.pass, this.modelSmartphone);
        return user;
    }
}
