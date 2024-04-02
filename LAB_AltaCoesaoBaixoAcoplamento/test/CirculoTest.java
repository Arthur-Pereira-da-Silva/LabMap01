package test;

import org.junit.Before;
import org.junit.Test;
import src.Circulo;
import static org.junit.Assert.*;

public class CirculoTest {
    private Circulo circulo;

    @Before
    public void setUp() {
        circulo = new Circulo(5.0); 
    }

    @Test
    public void testCalculaArea() {
        assertEquals(78.54, circulo.calculaArea(), 0.01); // area = 78,54 "esperado"
    }

    @Test
    public void testCalculaPerimetro() {
        assertEquals(31.42, circulo.calculaPerimetro(), 0.01); // perímetro = 31.42 "esperado"
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaioInvalido() {
        new Circulo(-1.0); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaioNaN() {
        new Circulo(Double.NaN); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaioInfinito() {
        new Circulo(Double.POSITIVE_INFINITY); // Deve lançar uma exceção; raio infinito
    }
}

