package br.edu.ifpb.controller.signup;

import br.edu.ifpb.models.User;
import br.edu.ifpb.models.UserManager;
import br.edu.ifpb.Proxy.UserProxy;

public class SignUp {

    private User user;

    UserProxy userProxy = new UserProxy(new UserManager());

    public SignUp(User user) {
        this.user = user;
    }

    public void register(){

        if (this.userProxy.signUp(this.user)) System.out.println("Cadastro concluído.");
        else System.out.println("Falha no cadastro");
    }


}
