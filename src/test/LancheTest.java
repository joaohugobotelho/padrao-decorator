package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import decorator.Bacon;
import decorator.Hamburguer;
import decorator.Lanche;
import decorator.Queijo;

public class LancheTest {

    @Test
    public void testHamburguerSimples() {
        Lanche lanche = new Hamburguer();
        assertEquals("Hamburguer", lanche.getDescricao()); // aqui ele faz um hamburguer simples
        assertEquals(10.0, lanche.getPreco());
    }

    @Test
    public void testHamburguerComQueijo() {
        Lanche lanche = new Hamburguer();
        lanche = new Queijo(lanche);

        assertEquals("Hamburguer + Queijo", lanche.getDescricao()); // aqui ele faz um hamburguer com queijo
        assertEquals(12.0, lanche.getPreco());
    }

    @Test
    public void testHamburguerCompleto() {
        Lanche lanche = new Hamburguer();
        lanche = new Queijo(lanche);
        lanche = new Bacon(lanche);   // aqui hamburguer com bacon e queijo 

        assertEquals("Hamburguer + Queijo + Bacon", lanche.getDescricao());
        assertEquals(15.0, lanche.getPreco());
    }

    @Test
    public void testMultiplosAdicionais() {
        Lanche lanche = new Hamburguer();
        lanche = new Bacon(lanche);           // aqui ele adicona dois acompanhamentos iguais
        lanche = new Bacon(lanche);

        assertEquals("Hamburguer + Bacon + Bacon", lanche.getDescricao());
        assertEquals(16.0, lanche.getPreco());
    }
}