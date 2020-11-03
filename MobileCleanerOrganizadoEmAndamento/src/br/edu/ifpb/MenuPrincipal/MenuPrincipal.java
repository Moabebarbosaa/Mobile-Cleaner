package br.edu.ifpb.MenuPrincipal;

import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.UserAccess.IUserAccessFactory;
import br.edu.ifpb.UserBuilder.IUserBuilder;


public class MenuPrincipal extends MenuAbstract{

    IUserBuilder userBuilder;
    IUserAccessFactory userAccessFactory;
    UserManager userManager;

    public MenuPrincipal(IUserBuilder userBuilder, IUserAccessFactory userAccessFactory, UserManager userManager) {
        this.userBuilder = userBuilder;
        this.userAccessFactory = userAccessFactory;
        this.userManager = userManager;
    }

    public void exibirMenu() {
        String menu = "===============================\n";
        menu += "MENU PRINCIPAL - MobileCleaner\n\n";
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


    private void singUp() {
        String name = obterString("Nome: ");
        String login = obterString("Login: ");
        String pass = obterString("Senha: ");
        String modelSmartphone = obterString("Modelo do celular: ");

        User user = this.userBuilder.setName(name).setLogin(login).setPass(pass).setModelSmartphone(modelSmartphone).builder();
        if (this.userAccessFactory.singUp(user).register()) System.out.println("Cadastrado com sucesso.");
        else System.out.println("Falha ao cadastrar.");
    }


    private void singIn() {
        String login = obterString("Login: ");
        String pass = obterString("Senha: ");

        User user = this.userBuilder.setLogin(login).setPass(pass).builder();
        if(this.userAccessFactory.singIn(user).enter()) {
            if (userManager.checkAdmin(user)) dashboardAdmin();
            else dashboardUser();
        }
        else dashboardUser();
    }


    private void dashboardUser() {

        //DashboardUser dashboardUser = new DashboardUser();

        while (true) {
            String menu = "\n\n\n=================================================\n";
            //menu += this.dashboardUser.getTitulo() + " - MobileCleaner\n\n";
            menu += "1 - Realizar limpesa\n";
            menu += "2 - Quantidade de dias para proxima limpesa\n";
            menu += "3 - Verificar notificações\n";
            menu += "4 - Locais para limpesa\n";
            menu += "5 - Histórico de limpesa\n";
            menu += "6 - Voltar\n";
            menu += "=================================================\n";

            System.out.println(menu);

            Integer chosenOption = obterInteger("Digite uma opção: ");

            switch (chosenOption) {
                case 1:

                    System.out.println();
                    break;
                case 2:

                    System.out.println();
                    break;
                case 3:
                    return;
                case 4:

                    System.out.println();
                    break;
                case 5:

                    System.out.println();
                    break;
                case 6:
                    return;
                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + chosenOption);
                    System.out.println();
                    break;
            }
        }
    }


    private void dashboardAdmin() {

        //DashboardAdmin dashboardAdmin = new DashboardAdmin();

        while (true) {
            String menu = "\n\n\n===============================\n";
            //menu += dashboardAdmin.getTitulo() + " - MobileCleaner\n\n";
            menu += "1 - Enviar mensagem para um usuario\n";
            menu += "2 - Listas de usuarios\n";
            menu += "3 - Listas de usuarios atrasadas com a limpesa\n";
            menu += "4 - Voltar\n";
            menu += "===============================\n";

            System.out.println(menu);

            Integer chosenOption = obterInteger("Digite uma opção: ");

            switch (chosenOption) {
                case 1:
                    //dashboardAdmin.showUserList();
                    System.out.println("\nEscolha o ID para mandar a mensagem:");
                    System.out.println();
                    break;
                case 2:
                    //dashboardAdmin.showUserList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + chosenOption);
                    System.out.println();
                    break;
            }

        }

    }
}
