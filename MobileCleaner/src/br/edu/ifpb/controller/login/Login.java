package br.edu.ifpb.controller.login;

import br.edu.ifpb.models.UserManager;

public class Login {

    UserManager userManager = new UserManager();
    private String login;
    private String pass;

    public Login(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public void fazerLogin() {

        if(this.userManager.signIn(this.login, this.pass)) {
            System.out.println("Login Válido");
        } else {
            System.out.println("Login Inválido!");
        }
    }
}
