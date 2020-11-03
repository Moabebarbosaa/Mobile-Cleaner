package br.edu.ifpb.view;

import br.edu.ifpb.FactoryMethod.CadastroModel;
import br.edu.ifpb.FactoryMethod.ICadaastroModel;
import br.edu.ifpb.UserBuilder.UserBuilder;
import br.edu.ifpb.controller.dashboard.DashboardAdmin;
import br.edu.ifpb.controller.dashboard.DashboardUser;
import br.edu.ifpb.controller.login.Login;
import br.edu.ifpb.controller.signup.SignUp;
import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);

    UserManager userManager = new UserManager();

    public void exibirMenu() {
        String menu = "===============================\n";
        menu += "MENU PRINCIPAL - MobileCleaner\n\n";
        menu += "1 - Cadastrar usuário\n";
        menu += "2 - Fazer login\n";
        menu += "3 - Sair\n";
        menu += "===============================\n";


        while (true) {
            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    System.out.println();
                    break;
                case 2:
                    fazerLogin();
                    System.out.println();
                    break;
                case 3:
                    return;

                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + opcao);
                    System.out.println();
                    break;
            }

        }
    }


    private void cadastrarUsuario() {
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();
        System.out.println("Modelo Celular: ");
        String modelCel = sc.next();

        UserBuilder userBuilder = new UserBuilder();

        User user = userBuilder.setName(nome).setLogin(login).setPass(senha).setModelSmartphone(modelCel).builder();
        SignUp signup = new SignUp(user);
        signup.register();
    }

    private void fazerLogin() {
        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();

        ICadaastroModel factory = new CadastroModel();
        Login login1 = factory.fazerLogin(login, senha);
        if (userManager.checkAdmin(login, senha)) dashboardAdmin();
        else dashboardUser();

    }

    public void dashboardUser() {

        DashboardUser dashboardUser = new DashboardUser();

        while (true) {
            String menu = "\n\n\n=================================================\n";
            menu += dashboardUser.getTitulo() + " - MobileCleaner\n\n";
            menu += "1 - Realizar limpeza\n";
            menu += "2 - Quantidade de dias para proxima limpeza\n";
            menu += "3 - Verificar notificações\n";
            menu += "4 - Locais para limpeza\n";
            menu += "5 - Histórico de limpeza\n";
            menu += "6 - Voltar\n";
            menu += "=================================================\n";

            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    performCleaningOption();
                    System.out.println();
                    break;
                case 2:

                    System.out.println();
                    break;
                case 3:
                    return;
                case 4:
                    dashboardUser.listPlaces();
                    System.out.println();
                    break;
                case 5:

                    System.out.println();
                    break;
                case 6:
                    return;
                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + opcao);
                    System.out.println();
                    break;
            }

        }

    }

    public void dashboardAdmin() {

        DashboardAdmin dashboardAdmin = new DashboardAdmin();

        while (true) {
            String menu = "\n\n\n===============================\n";
            menu += dashboardAdmin.getTitulo() + " - MobileCleaner\n\n";
            menu += "1 - Enviar mensagem para um usuario\n";
            menu += "2 - Listas de usuarios\n";
            menu += "3 - Listas de usuarios atrasadas com a limpesa\n";
            menu += "4 - Voltar\n";
            menu += "===============================\n";

            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    dashboardAdmin.showUserList();
                    System.out.println("\nEscolha o ID para mandar a mensagem:");
                    System.out.println();
                    break;
                case 2:
                    dashboardAdmin.showUserList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    System.out.println();
                    System.out.println("Erro! Digite uma opção válida: " + opcao);
                    System.out.println();
                    break;
            }

        }

    }

    public void performCleaningOption() {
        DashboardUser dashboardUser = new DashboardUser();
        dashboardUser.listPlaces();

        System.out.println("Opção: ");
        String option = sc.next();

        dashboardUser.performCleaning(option);

    }
}
