package test;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.*;

public class TrianguloTest {
    private Triangulo triangulo;

    @Before
    public void setUp() {
        triangulo = new Triangulo(3.0, 4.0, 5.0);
    }

    @Test
    public void testGetA() {
        assertEquals(3.0, triangulo.getA(), 0.0001);
    }

    @Test
    public void testSetA() {
        triangulo.setA(6.0);
        assertEquals(6.0, triangulo.getA(), 0.0001);
    }

    @Test
    public void testGetB() {
        assertEquals(4.0, triangulo.getB(), 0.0001);
    }

    @Test
    public void testSetB() {
        triangulo.setB(7.0);
        assertEquals(7.0, triangulo.getB(), 0.0001);
    }

    @Test
    public void testGetC() {
        assertEquals(5.0, triangulo.getC(), 0.0001);
    }

    @Test
    public void testSetC() {
        triangulo.setC(8.0);
        assertEquals(8.0, triangulo.getC(), 0.0001);
    }

    @Test
    public void testEquals() {
        Triangulo sameTriangulo = new Triangulo(3.0, 4.0, 5.0);
        Triangulo differentTriangulo = new Triangulo(6.0, 7.0, 8.0);
        assertTrue(triangulo.equals(sameTriangulo));
        assertFalse(triangulo.equals(differentTriangulo));
        assertFalse(triangulo.equals(null));
        assertFalse(triangulo.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Triangulo sameTriangulo = new Triangulo(3.0, 4.0, 5.0);
        assertEquals(triangulo.hashCode(), sameTriangulo.hashCode());
    }

    @Test
    public void testAceitarVisita() {
        VisitorMock visitor = new VisitorMock();
        double result = triangulo.aceitarVisita(visitor);
        assertEquals(12.0, result, 0.0001); 
    }

    private class VisitorMock implements Visitor {
        @Override
        public double visitarCirculo(Circulo c) {
            return 0;
        }

        @Override
        public double visitarTriangulo(Triangulo t) {
            return t.getA() + t.getB() + t.getC();
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

