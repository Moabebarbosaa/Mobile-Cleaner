package br.edu.ifpb.MenuFacade.ChainOfResponsability;

import br.edu.ifpb.Model.User.User;

public class ValidationFields implements IChain{

    private IChain chain;
    private User user;

    public ValidationFields(User user) {
        this.user = user;
    }

    @Override
    public void next(IChain chain) {
        this.chain = chain;
    }

    @Override
    public boolean go() {

        User user = this.user;

        if (user.getName().equals("") || user.getName().equals(null)) {
            System.out.println("Digite um nome válido, por favor!");
            return false;
        }

        return true;
    }
}
