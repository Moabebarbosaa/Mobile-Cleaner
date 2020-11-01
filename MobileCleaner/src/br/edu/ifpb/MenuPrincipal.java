package br.edu.ifpb;

import br.edu.ifpb.dashboard.Dashboard;
import br.edu.ifpb.dashboard.DashboardUserProxy;
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

                case 4:
                    System.out.println("dklsah");
                    System.out.println();
                    break;
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
        if (this.userManager.signUp(user)) System.out.println("Cadastro concluído.");
        else System.out.println("Falha no cadastro");
    }

    private void fazerLogin() {
        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();



        if(this.userManager.signIn(login, senha)) {
            Dashboard dashboard = new DashboardUserProxy(login, senha);
            dashboard.displayDashboard();
        } else {
            System.out.println("Login Inválido!");
        }
    }
}
