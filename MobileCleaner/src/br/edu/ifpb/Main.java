package br.edu.ifpb;


import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

public class Main {

    public static void main(String[] args) {


        User user = new User("Lucas", "lucasteus", "1234", "XIAOMI", "AMAZON");

        UserManager userManager = new UserManager();

        userManager.signUp(user);

        System.out.println("teste salvar git Lucas");
        System.out.println("teste salvar git Lucas 2");

        System.out.println("teste salvar git Lucas 3");

    }
}
