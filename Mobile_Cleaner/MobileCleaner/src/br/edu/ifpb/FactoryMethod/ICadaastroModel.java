package br.edu.ifpb.FactoryMethod;

import br.edu.ifpb.controller.login.Login;
import br.edu.ifpb.models.User;

public interface ICadaastroModel {

    public User createUser(String name, String login, String pass, String modelSmartphone);

    public Login fazerLogin(String login, String pass);

}
