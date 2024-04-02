package test;

import org.junit.Before;
import org.junit.Test;
import src.Quadrado;
import static org.junit.Assert.*;

public class QuadradoTest {
    private Quadrado quadrado;

    @Before
    public void setUp() {
        quadrado = new Quadrado(4.0); 
    }

    @Test
    public void testCalculaArea() {
        assertEquals(16.0, quadrado.calculaArea(), 0.01); // área = 16.0 "esperado"
    }

    @Test
    public void testCalculaPerimetro() {
        assertEquals(16.0, quadrado.calculaPerimetro(), 0.01); //perímetro = 16.0 "esperado"
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLadoInvalido() {
        new Quadrado(-1.0); //exceção lado inválido
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLadoNaN() {
        new Quadrado(Double.NaN); //exceção devido ao lado ser NaN
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLadoInfinito() {
        new Quadrado(Double.POSITIVE_INFINITY); // exceção devido ao lado ser infinito
    }
}
