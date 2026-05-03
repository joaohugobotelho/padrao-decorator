package decorator;

public class Queijo extends LancheDecorator {

    public Queijo(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + " + Queijo";
    }

    @Override
    public double getPreco() {
        return lanche.getPreco() + 2.0;
    }
}