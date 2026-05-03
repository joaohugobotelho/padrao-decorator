package decorator;

public class Hamburguer implements Lanche {

    @Override
    public String getDescricao() {
        return "Hamburguer";
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}