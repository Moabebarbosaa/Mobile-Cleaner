package br.edu.ifpb.MenuFacade;

import br.edu.ifpb.ActionDashboard.ActionDashboardFactory;
import br.edu.ifpb.Model.CleanPlace.CleanPlace;
import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.User;
import br.edu.ifpb.Model.User.UserManager;

import java.util.List;

public class MenuDashboardUser extends MenuAbstract{

    ActionDashboardFactory actionDashboardFactory;
    UserManager userManager;
    CleanPlaceManager cleanPlaceManager;

    public MenuDashboardUser(String title, ActionDashboardFactory actionDashboardFactory, UserManager userManager, CleanPlaceManager cleanPlaceManager) {
        super(title);
        this.actionDashboardFactory = actionDashboardFactory;
        this.userManager = userManager;
        this.cleanPlaceManager = cleanPlaceManager;
    }

    public void showDashboardUser(User user) {
        while (true) {
            String menu = "\n\n\n=================================================\n";
            menu += this.title + " - MobileCleaner\n\n";
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
                    String message = this.actionDashboardFactory.verifyNotification(this.userManager).show(user);
                    System.out.println("Notificação: " + message);
                    break;
                case 4:
                    List<CleanPlace> list = this.actionDashboardFactory.placesClean(this.cleanPlaceManager).show();
                    for (CleanPlace cleanPlace: list) {
                        System.out.println(cleanPlace.toString());
                    }
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

}
