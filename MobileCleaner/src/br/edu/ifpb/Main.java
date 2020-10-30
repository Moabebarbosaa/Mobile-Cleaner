package br.edu.ifpb;

import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

public class Main {

    public static void main(String[] args) {

        User user = new User("João", "joao123", "4567", "Samsung", "Google");
        UserManager userManager = new UserManager();
        userManager.signUp(user);

    }
}
