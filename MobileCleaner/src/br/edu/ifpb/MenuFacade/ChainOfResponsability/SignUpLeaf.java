package br.edu.ifpb.MenuFacade.ChainOfResponsability;

public class SignUpLeaf implements IChain{

    private IChain chain;

    public SignUpLeaf() {
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
