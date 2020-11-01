package br.edu.ifpb.controller.dashboard;

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
        DashboardAdmin dashboardAdmin = new DashboardAdmin(this.login, this.pass);
        dashboardAdmin.realizarLimpesa();

    }
}


//if (admin) {
//        DashboardAdmin dashboardAdmin = new DashboardAdmin(this.login, this.pass);
//        dashboardAdmin.displayDashboard();
//        } else {
//        View view = new View();
//        view.getView().dashboardUser();
//        }