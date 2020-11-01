package br.edu.ifpb.cotroller.dashboard;


import br.edu.ifpb.view.View;

public class DashboardAdmin implements Dashboard {

    private String login;
    private String pass;

    public DashboardAdmin(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Override
    public void displayDashboard() {
        View view = new View();
        view.getView().dashboardAdmin();
    }


    public void sendMensage() {

    }

    public void realizarLimpesa() {

    }


}
