package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.ActionDashboard.ActionDashboardFactory;
import br.edu.ifpb.CleanPlaceBuilder.CleanPlaceBuilder;
import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Model.User.UserProxy;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserAccess.UserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;
import br.edu.ifpb.UserBuilder.UserBuilder;

import java.text.ParseException;


public class Facade {

    IUserBuilder userBuilder;
    IUserAccessFactory userAccessFactory;
    UserManager userManager;
    UserProxy userProxy;
    MenuPrincipal menuPrincipal;
    MenuDashboardAdmin menuDashboardAdmin;
    MenuDashboardUser menuDashboardUser;
    ActionDashboardFactory actionDashboardFactory;
    CleanPlaceManager cleanPlaceManager;
    CleanPlaceBuilder cleanPlaceBuilder;

    public Facade() {
        this.userBuilder = new UserBuilder();
        this.cleanPlaceBuilder = new CleanPlaceBuilder();
        this.userAccessFactory = new UserAccessFactory();
        this.userManager = new UserManager();
        this.cleanPlaceManager = new CleanPlaceManager();
        this.userProxy = new UserProxy(this.userManager);
        this.actionDashboardFactory = new ActionDashboardFactory(this.userManager);
        this.menuDashboardAdmin = new MenuDashboardAdmin("Menu Administrador", this.actionDashboardFactory, this.userManager, this.cleanPlaceManager, this.cleanPlaceBuilder, this.userBuilder);
        this.menuDashboardUser = new MenuDashboardUser("Menu Usuário", this.actionDashboardFactory, this.userManager, this.cleanPlaceManager);
        this.menuPrincipal = new MenuPrincipal("Menu Principal",userBuilder, userAccessFactory, userManager, userProxy, menuDashboardAdmin, menuDashboardUser);
    }

    public void exibirMenu() throws ParseException {
        this.menuPrincipal.exibirMenu();
    }

}
