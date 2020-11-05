package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.ActionDashboard.ActionDashboardFactory;
import br.edu.ifpb.CleanPlaceBuilder.CleanPlaceBuilder;
import br.edu.ifpb.Model.CleanPlace.CleanPlace;
import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.IUser;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;
import br.edu.ifpb.UserBuilder.IUserBuilder;
import br.edu.ifpb.UserBuilder.UserBuilder;

import java.util.List;
import java.util.Scanner;

public class MenuDashboardAdmin extends MenuAbstract{

    private final Scanner sc = new Scanner(System.in);

    ActionDashboardFactory actionDashboardFactory;
    UserManager userManager;
    CleanPlaceManager cleanPlaceManager;
    CleanPlaceBuilder cleanPlaceBuilder;
    IUserBuilder userBuilder;

    public MenuDashboardAdmin(String title, ActionDashboardFactory actionDashboardFactory, UserManager userManager, CleanPlaceManager cleanPlaceManager, CleanPlaceBuilder cleanPlaceBuilder, IUserBuilder userBuilder) {
        super(title);
        this.actionDashboardFactory = actionDashboardFactory;
        this.userManager = userManager;
        this.cleanPlaceManager = cleanPlaceManager;
        this.cleanPlaceBuilder = cleanPlaceBuilder;
        this.userBuilder = userBuilder;
    }

    public void showDashboardAdmin() {

        while (true) {
            String menu = "\n\n\n=================================================\n";
            menu += this.title + " - MobileCleaner\n\n";
            menu += "1 - Enviar mensagem para um usuario\n";
            menu += "2 - Listas de usuarios\n";
            menu += "3 - Listas de usuarios atrasadas com a limpesa\n";
            menu += "4 - Adicionar local de limpesa\n";
            menu += "5 - Adicionar admin\n";
            menu += "6 - Voltar\n";
            menu += "=================================================\n";

            System.out.println(menu);

            Integer chosenOption = obterInteger("Digite uma opção: ");

            switch (chosenOption) {
                case 1:
                    showUsers();
                    String login = obterString("Login do usuário para qual deseja mandar mensagem: ");
                    System.out.println("Mensagem: ");
                    String message = sc.nextLine();
                    if (this.actionDashboardFactory.sendMessage(this.userManager).send(login, message)) {
                        System.out.println("Mensagem enviada.");
                    } else {
                        System.out.println("Erro ao enviar mensagem.");
                    }
                    break;
                case 2:
                    showUsers();
                    break;
                case 3:
                    System.out.println();
                case 4:
                    System.out.println("Nome: ");
                    String name = sc.nextLine();
                    System.out.println("Setor: ");
                    String sector = sc.nextLine();

                    CleanPlace place = this.cleanPlaceBuilder.setName(name).setSector(sector).builder();
                    if (this.actionDashboardFactory.addCleanPlace(this.cleanPlaceManager).add(place)) {
                        System.out.println("Local adicionado.");
                    } else {
                        System.out.println("Erro ao adicionar local.");
                    }
                    break;
                case 5:
                    String nameAdmin = obterString("Nome: ");
                    String loginAdmin = obterString("Login: ");
                    String passAdmin = obterString("Senha: ");
                    String modelSmartphoneAdmin = obterString("Modelo do celular: ");

                    User user = this.userBuilder.setName(nameAdmin).setLogin(loginAdmin).setPass(passAdmin).setModelSmartphone(modelSmartphoneAdmin).setPermission("admin").builder();

                    if (this.actionDashboardFactory.addAdmin(this.userManager).enter(user)) System.out.println("\n\nCadastrado com sucesso.");
                    else System.out.println("Falha ao cadastrar.");

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

    private void showUsers() {
        List<User> list = this.actionDashboardFactory.showUserList(this.userManager).show();

        for (User user: list) {
            System.out.println(user.toString());
        }
    }
}
