package br.edu.ifpb.cotroller.dashboard;

import br.edu.ifpb.models.UserManager;
import br.edu.ifpb.view.View;


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
            View view = new View();
            view.getView().dashboardUser();
        }
    }
}
