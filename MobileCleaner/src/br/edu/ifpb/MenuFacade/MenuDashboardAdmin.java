package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.ActionDashboard.ActionDashboardFactory;
import br.edu.ifpb.CleanPlaceBuilder.CleanPlaceBuilder;
import br.edu.ifpb.Model.CleanPlace.CleanPlace;
import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.IUser;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;

import java.util.List;
import java.util.Scanner;

public class MenuDashboardAdmin extends MenuAbstract{

    private final Scanner sc = new Scanner(System.in);

    ActionDashboardFactory actionDashboardFactory;
    UserManager userManager;
    CleanPlaceManager cleanPlaceManager;
    CleanPlaceBuilder cleanPlaceBuilder;

    public MenuDashboardAdmin(String title, ActionDashboardFactory actionDashboardFactory, UserManager userManager,
                              CleanPlaceManager cleanPlaceManager, CleanPlaceBuilder cleanPlaceBuilder) {
        super(title);
        this.actionDashboardFactory = actionDashboardFactory;
        this.userManager = userManager;
        this.cleanPlaceManager = cleanPlaceManager;
        this.cleanPlaceBuilder = cleanPlaceBuilder;
    }

    public void showDashboardAdmin(IUser user) {

        while (true) {
            String menu = "\n\n\n=================================================\n";
            menu += this.title + " - MobileCleaner\n\n";
            menu += "1 - Enviar mensagem para um usuario\n";
            menu += "2 - Listas de usuarios\n";
            menu += "3 - Listas de usuarios atrasadas com a limpesa\n";
            menu += "4 - Adicionar local de limpesa\n";
            menu += "5 - Voltar\n";
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
        List<IUser> list = this.actionDashboardFactory.showUserList(this.userManager).show();

        for (IUser user: list) {
            System.out.println(user.toString());
        }
    }
}
