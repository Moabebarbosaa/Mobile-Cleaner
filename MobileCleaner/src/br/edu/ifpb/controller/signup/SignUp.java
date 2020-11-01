package br.edu.ifpb.controller.signup;

import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;

public class SignUp {

    private User user;

    UserManager userManager = new UserManager();

    public SignUp(User user) {
        this.user = user;
    }

    public void register(){

        if (this.userManager.signUp(this.user)) System.out.println("Cadastro concluído.");
        else System.out.println("Falha no cadastro");
    }


}
