package test;

import elements.Retangulo;
import elements.Circulo;
import elements.Triangulo;
import elements.Trapezio;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.*;

public class RetanguloTest {
    private Retangulo retangulo;

    @Before
    public void setUp() {
        retangulo = new Retangulo(4.0, 5.0);
    }

    @Test
    public void testGetBase() {
        assertEquals(4.0, retangulo.getBase(), 0.0001);
    }

    @Test
    public void testSetBase() {
        retangulo.setBase(6.0);
        assertEquals(6.0, retangulo.getBase(), 0.0001);
    }

    @Test
    public void testGetAltura() {
        assertEquals(5.0, retangulo.getAltura(), 0.0001);
    }

    @Test
    public void testSetAltura() {
        retangulo.setAltura(7.0);
        assertEquals(7.0, retangulo.getAltura(), 0.0001);
    }

    @Test
    public void testEquals() {
        Retangulo sameRetangulo = new Retangulo(4.0, 5.0);
        Retangulo differentRetangulo = new Retangulo(6.0, 7.0);
        assertTrue(retangulo.equals(sameRetangulo));
        assertFalse(retangulo.equals(differentRetangulo));
        assertFalse(retangulo.equals(null));
        assertFalse(retangulo.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Retangulo sameRetangulo = new Retangulo(4.0, 5.0);
        assertEquals(retangulo.hashCode(), sameRetangulo.hashCode());
    }

    @Test
    public void testAceitarVisita() {
        VisitorMock visitor = new VisitorMock();
        double result = retangulo.aceitarVisita(visitor);
        assertEquals(20.0, result, 0.0001);
    }

    private class VisitorMock implements Visitor {
        @Override
        public double visitarCirculo(Circulo c) {
            return 0;
        }

        @Override
        public double visitarTriangulo(Triangulo t) {
            return 0;
        }

        @Override
        public double visitarRetangulo(Retangulo r) {
            return r.getBase() * r.getAltura();
        }

        @Override
        public double visitarTrapezio(Trapezio t) {
            return 0;
        }
    }
}

