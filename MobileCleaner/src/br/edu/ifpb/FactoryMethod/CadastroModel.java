package br.edu.ifpb.FactoryMethod;

import br.edu.ifpb.controller.login.Login;
import br.edu.ifpb.models.User;

public class CadastroModel implements ICadaastroModel {

    @Override
    public User createUser(String name, String login, String pass, String modelSmartphone) {
        return new User(name, login, pass, modelSmartphone);
    }

    @Override
    public Login fazerLogin(String login, String pass) {
        return new Login(login, pass);
    }
}
