package test;

import elements.*;
import org.junit.Before;
import org.junit.Test;
import visitors.CalcularPerimetroVisitor;

import static org.junit.Assert.*;

public class CalcularPerimetroVisitorTest {
    private CalcularPerimetroVisitor visitor;

    @Before
    public void setUp() {
        visitor = new CalcularPerimetroVisitor();
    }

    @Test
    public void testVisitarCirculo() {
        Circulo circulo = new Circulo(3.0);
        double expectedPerimetro = 2.0 * Math.PI * 3.0;
        assertEquals(expectedPerimetro, visitor.visitarCirculo(circulo), 0.0001);
    }

    @Test
    public void testVisitarTriangulo() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        double expectedPerimetro = 3.0 + 4.0 + 5.0;
        assertEquals(expectedPerimetro, visitor.visitarTriangulo(triangulo), 0.0001);
    }

    @Test
    public void testVisitarRetangulo() {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        double expectedPerimetro = 2.0 * (4.0 + 5.0);
        assertEquals(expectedPerimetro, visitor.visitarRetangulo(retangulo), 0.0001);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3.0, 4.0, 5.0);
        double expectedPerimetro = 3.0 + 4.0 + 2.0 * 5.0;
        assertEquals(expectedPerimetro, visitor.visitarTrapezio(trapezio), 0.0001);
    }
}
