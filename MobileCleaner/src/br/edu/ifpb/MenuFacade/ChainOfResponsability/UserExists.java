package br.edu.ifpb.MenuFacade.ChainOfResponsability;

public class UserExists implements IChain{

    private IChain chain;

    public UserExists() {
        // por enquanto
    }

    @Override
    public void next(IChain chain) {
        this.chain = chain;
    }

    @Override
    public boolean go() {
        return true;
    }
}
