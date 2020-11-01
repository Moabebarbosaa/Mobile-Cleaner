package br.edu.ifpb.dashboard;



public class DashboardAdmin implements Dashboard {

    private String login;
    private String pass;

    public DashboardAdmin(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Override
    public void displayDashboard() {
        String menu = "\n\n\n===============================\n";
        menu += "DASHBOAD(admin) - MobileCleaner\n\n";
        menu += "1 - Enviar mensagem para um usuario\n";
        menu += "2 - Listas de usuarios\n";
        menu += "3 - Listas de usuarios atrasadas com a limpesa\n";
        menu += "===============================\n";

        System.out.println(menu);
    }
}
