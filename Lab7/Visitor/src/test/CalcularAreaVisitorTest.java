package test;

import elements.*;
import org.junit.Before;
import org.junit.Test;
import visitors.CalcularAreaVisitor;

import static org.junit.Assert.*;

public class CalcularAreaVisitorTest {
    private CalcularAreaVisitor visitor;

    @Before
    public void setUp() {
        visitor = new CalcularAreaVisitor();
    }

    @Test
    public void testVisitarCirculo() {
        Circulo circulo = new Circulo(3.0);
        double expectedArea = Math.PI * Math.pow(3.0, 2);
        assertEquals(expectedArea, visitor.visitarCirculo(circulo), 0.0001);
    }

    @Test
    public void testVisitarTriangulo() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        double p = (3.0 + 4.0 + 5.0) / 2.0;
        double expectedArea = Math.sqrt(p * (p - 3.0) * (p - 4.0) * (p - 5.0));
        assertEquals(expectedArea, visitor.visitarTriangulo(triangulo), 0.0001);
    }

    @Test
    public void testVisitarRetangulo() {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        double expectedArea = 4.0 * 5.0;
        assertEquals(expectedArea, visitor.visitarRetangulo(retangulo), 0.0001);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3.0, 4.0, 5.0);
        double expectedArea = ((3.0 + 4.0) * 5.0) / 2.0;
        assertEquals(expectedArea, visitor.visitarTrapezio(trapezio), 0.0001);
    }
}
