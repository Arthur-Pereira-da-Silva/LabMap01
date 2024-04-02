package test;

import org.junit.Before;
import org.junit.Test;
import src.Retangulo;
import static org.junit.Assert.*;

public class RetanguloTest {
    private Retangulo retangulo;

    @Before
    public void setUp() {
        retangulo = new Retangulo(4.0, 6.0); 
    }

    @Test
    public void testCalculaArea() {
        assertEquals(24.0, retangulo.calculaArea(), 0.01); //área = 24.0 "esperado"
    }

    @Test
    public void testCalculaPerimetro() {
        assertEquals(20.0, retangulo.calculaPerimetro(), 0.01); //perímetro = 20.0 "esperado"
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAlturaInvalida() {
        new Retangulo(-1.0, 6.0); //exceção altura inválida
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLarguraInvalida() {
        new Retangulo(4.0, -1.0); //exceção largura inválida
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAlturaNaN() {
        new Retangulo(Double.NaN, 6.0); //exceção devido à altura ser NaN
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLarguraNaN() {
        new Retangulo(4.0, Double.NaN); //exceção devido à largura ser NaN
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAlturaInfinita() {
        new Retangulo(Double.POSITIVE_INFINITY, 6.0); //exceção devido à altura ser infinita
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLarguraInfinita() {
        new Retangulo(4.0, Double.POSITIVE_INFINITY); //exceção devido à largura ser infinita
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAlturaIgualLargura() {
        new Retangulo(4.0, 4.0); //exceção devido à altura ser igual à largura
    }
}

