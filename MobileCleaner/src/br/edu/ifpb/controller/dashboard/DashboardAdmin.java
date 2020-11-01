package br.edu.ifpb.controller.dashboard;

import br.edu.ifpb.models.UserManager;
import br.edu.ifpb.view.View;

public class DashboardAdmin implements Dashboard {

    private String login;
    private String pass;

    UserManager userManager = new UserManager();
    View view = new View();

    public DashboardAdmin(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Override
    public void displayDashboard() {
        view.getView().dashboardAdmin();
    }


    public void sendMensage() {

    }

    public void realizarLimpesa() {
        System.out.println("LIMPANDOOOOOOO");
    }



}
