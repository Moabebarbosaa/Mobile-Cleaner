package br.edu.ifpb.dashboard;

import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;


public class DashboardUserProxy implements Dashboard{


    private final boolean admin;
    private String login;
    private String pass;

    public DashboardUserProxy(String login, String pass) {
        UserManager userManager = new UserManager();
        this.admin = userManager.checkAdmin(login, pass);
    }

    @Override
    public void displayDashboard() {
        if (admin) {
            DashboardAdmin dashboardAdmin = new DashboardAdmin(this.login, this.pass);
            dashboardAdmin.displayDashboard();
        } else {
            String menu = "\n\n\n===============================\n";
            menu += "DASHBOAD(user) - MobileCleaner\n\n";
            menu += "1 - Realizar limpesa\n";
            menu += "2 - Quantidade de dias para proxima limpesa\n";
            menu += "3 - Verificar notificações\n";
            menu += "4 - Locais para limpesa\n";
            menu += "5 - Histórico de limpesa\n";
            menu += "===============================\n";

            System.out.println(menu);
        }
    }



}
