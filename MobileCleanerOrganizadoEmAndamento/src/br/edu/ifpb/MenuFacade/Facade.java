package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Proxy.UserProxy;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserAccess.UserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;
import br.edu.ifpb.UserBuilder.UserBuilder;


public class Facade {

    IUserBuilder userBuilder;
    IUserAccessFactory userAccessFactory;
    UserManager userManager;
    UserProxy userProxy;
    MenuPrincipal menuPrincipal;

    public Facade() {
        this.userBuilder = new UserBuilder();
        this.userAccessFactory = new UserAccessFactory();
        this.userManager = new UserManager();
        this.userProxy = new UserProxy(this.userManager);
        this.menuPrincipal = new MenuPrincipal(userBuilder, userAccessFactory, userManager, userProxy);
    }

    public void exibirMenu() {
        this.menuPrincipal.exibirMenu();
    }
    
}
