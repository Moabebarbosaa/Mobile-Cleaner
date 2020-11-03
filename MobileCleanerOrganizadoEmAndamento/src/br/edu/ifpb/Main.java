package br.edu.ifpb;

import br.edu.ifpb.MenuPrincipal.MenuPrincipal;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserAccess.UserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;
import br.edu.ifpb.UserBuilder.UserBuilder;

public class Main {

    public static void main(String[] args) {

        IUserBuilder userBuilder = new UserBuilder();
        IUserAccessFactory userAccessFactory = new UserAccessFactory();
        UserManager userManager = new UserManager();
        //DashboardAdmin dashboardAdmin = new DashboardAdmin(userManager);
        //DashboardUser dashboardUser = new DashboardUser(userManager);

        MenuPrincipal menuPrincipal = new MenuPrincipal(userBuilder, userAccessFactory, userManager);
        menuPrincipal.exibirMenu();

    }
}
