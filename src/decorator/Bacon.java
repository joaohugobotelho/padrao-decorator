package decorator;
public class Bacon extends LancheDecorator {

    public Bacon(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + " + Bacon";
    }

    @Override
    public double getPreco() {
        return lanche.getPreco() + 3.0;
    }
}