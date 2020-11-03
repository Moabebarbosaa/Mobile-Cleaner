package br.edu.ifpb;

import br.edu.ifpb.MenuFacade.Facade;
import br.edu.ifpb.MenuFacade.MenuPrincipal;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserAccess.UserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;
import br.edu.ifpb.UserBuilder.UserBuilder;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.exibirMenu();

    }
}
