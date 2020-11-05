package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.Model.User.IUser;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.Model.User.UserProxy;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;

import java.text.ParseException;


public class MenuPrincipal extends MenuAbstract{

    IUserBuilder userBuilder;
    IUserAccessFactory userAccessFactory;
    UserManager userManager;
    UserProxy userProxy;
    MenuDashboardAdmin menuDashboardAdmin;
    MenuDashboardUser menuDashboardUser;

    public MenuPrincipal(String title, IUserBuilder userBuilder, IUserAccessFactory userAccessFactory, UserManager userManager, UserProxy userProxy, MenuDashboardAdmin menuDashboardAdmin, MenuDashboardUser menuDashboardUser) {
        super(title);
        this.userBuilder = userBuilder;
        this.userAccessFactory = userAccessFactory;
        this.userManager = userManager;
        this.userProxy = userProxy;
        this.menuDashboardAdmin = menuDashboardAdmin;
        this.menuDashboardUser = menuDashboardUser;
    }

    public void exibirMenu() throws ParseException {
        String menu = "===============================\n";
        menu += this.title + " - MobileCleaner\n\n";
        menu += "1 - Cadastrar\n";
        menu += "2 - Fazer login\n";
        menu += "3 - Sair\n";
        menu += "===============================\n";


        while (true) {
            System.out.println(menu);

            Integer chosenOption = obterInteger("Digite uma opção: ");

            switch (chosenOption) {
                case 1:
                    singUp();
                    System.out.println();
                    break;
                case 2:
                    singIn();
                    System.out.println();
                    break;
                case 3:
                    return;

                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + chosenOption);
                    System.out.println();
                    break;
            }

        }
    }


    private void singUp() throws ParseException {
        String name = obterString("Nome: ");
        String login = obterString("Login: ");
        String pass = obterString("Senha: ");
        String modelSmartphone = obterString("Modelo do celular: ");

        User user = this.userBuilder.setName(name).setLogin(login).setPass(pass).setModelSmartphone(modelSmartphone).builder();
        if (this.userAccessFactory.singUp(user, this.userProxy).register()) System.out.println("Cadastrado com sucesso.");
        else System.out.println("Falha ao cadastrar.");
    }


    private void singIn() {
        String login = obterString("Login: ");
        String pass = obterString("Senha: ");

        User user = this.userBuilder.setLogin(login).setPass(pass).builder();
        if(this.userAccessFactory.singIn(userManager, user).enter()) {
            if (userManager.checkAdmin(user)) this.menuDashboardAdmin.showDashboardAdmin(user);
            else this.menuDashboardUser.showDashboardUser(user);
        }
        else System.out.println("Login inválido");
    }

}
