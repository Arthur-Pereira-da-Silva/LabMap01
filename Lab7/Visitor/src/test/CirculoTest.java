package test;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.*;

public class CirculoTest {
    private Circulo circulo;

    @Before
    public void setUp() {
        circulo = new Circulo(3.0);
    }

    @Test
    public void testGetRaio() {
        assertEquals(3.0, circulo.getRaio(), 0.0001);
    }

    @Test
    public void testSetRaio() {
        circulo.setRaio(5.0);
        assertEquals(5.0, circulo.getRaio(), 0.0001);
    }

    @Test
    public void testEquals() {
        Circulo sameCirculo = new Circulo(3.0);
        Circulo differentCirculo = new Circulo(4.0);
        assertTrue(circulo.equals(sameCirculo));
        assertFalse(circulo.equals(differentCirculo));
        assertFalse(circulo.equals(null));
        assertFalse(circulo.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Circulo sameCirculo = new Circulo(3.0);
        assertEquals(circulo.hashCode(), sameCirculo.hashCode());
    }

    @Test
    public void testAceitarVisita() {
        VisitorMock visitor = new VisitorMock();
        double result = circulo.aceitarVisita(visitor);
        assertEquals(3.0, result, 0.0001);
    }

    private class VisitorMock implements Visitor {
        @Override
        public double visitarCirculo(Circulo c) {
            return c.getRaio();
        }

        @Override
        public double visitarTriangulo(Triangulo t) {
            return 0;
        }

        @Override
        public double visitarRetangulo(Retangulo r) {
            return 0;
        }

        @Override
        public double visitarTrapezio(Trapezio t) {
            return 0;
        }
    }
}


