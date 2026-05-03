package decorator;

public abstract class LancheDecorator implements Lanche {
    protected Lanche lanche;

    public LancheDecorator(Lanche lanche) {
        this.lanche = lanche;
    }
}