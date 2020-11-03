package br.edu.ifpb.controller.dashboard;

import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

import java.util.List;

public class DashboardAdmin {

    public String titulo;

    UserManager userManager = new UserManager();

    public DashboardAdmin() {
        this.titulo = "Dashboard - Admin";
    }

    public String getTitulo() {
        return titulo;
    }

    public void sendMenssage(String mensagem) {

    }

    public void showUserList() {
        List<User> listUser = userManager.userList();

        for (User user : listUser) {
            System.out.println(user.toString());
        }

    }

}
