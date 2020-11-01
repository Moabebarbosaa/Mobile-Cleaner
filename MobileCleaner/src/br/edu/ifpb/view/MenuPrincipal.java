package br.edu.ifpb.view;

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

        User user = new User(nome, login, senha, modelCel);
        SignUp signup = new SignUp(user);
        signup.register();
    }

    private void fazerLogin() {
        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();

        Login logar = new Login(login, senha);
        logar.fazerLogin();
    }

    public void dashboardUser() {

        while (true) {
            String menu = "\n\n\n===============================\n";
            menu += "DASHBOAD(user) - MobileCleaner\n\n";
            menu += "1 - Realizar limpesa\n";
            menu += "2 - Quantidade de dias para proxima limpesa\n";
            menu += "3 - Verificar notificações\n";
            menu += "4 - Locais para limpesa\n";
            menu += "5 - Histórico de limpesa\n";
            menu += "6 - Voltar\n";
            menu += "===============================\n";

            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
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
                    System.out.println("Erro! Digite uma opção válida: " + opcao);
                    System.out.println();
                    break;
            }

        }

    }

    public void dashboardAdmin() {

        while (true) {
            String menu = "\n\n\n===============================\n";
            menu += "DASHBOAD(admin) - MobileCleaner\n\n";
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

                    System.out.println();
                    break;
                case 2:

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
}
