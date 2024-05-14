package test;

import elements.*;
import org.junit.Before;
import org.junit.Test;
import visitors.MaximizarVisitor;

import static org.junit.Assert.*;

public class MaximizarVisitorTest {
    private MaximizarVisitor visitor;

    @Before
    public void setUp() {
        visitor = new MaximizarVisitor();
    }

    @Test
    public void testVisitarCirculo() {
        Circulo circulo = new Circulo(3.0);
        visitor.visitarCirculo(circulo);
        double expectedRaio = 3.0 * 2.0;
        assertEquals(expectedRaio, circulo.getRaio(), 0.0001);
    }

    @Test
    public void testVisitarTriangulo() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        visitor.visitarTriangulo(triangulo);
        assertEquals(3.0 * 2.0, triangulo.getA(), 0.0001);
        assertEquals(4.0 * 2.0, triangulo.getB(), 0.0001);
        assertEquals(5.0 * 2.0, triangulo.getC(), 0.0001);
    }

    @Test
    public void testVisitarRetangulo() {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        visitor.visitarRetangulo(retangulo);
        assertEquals(4.0 * 2.0, retangulo.getBase(), 0.0001);
        assertEquals(5.0 * 2.0, retangulo.getAltura(), 0.0001);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3.0, 4.0, 5.0);
        visitor.visitarTrapezio(trapezio);
        assertEquals(3.0 * 2.0, trapezio.getBaseMaior(), 0.0001);
        assertEquals(4.0 * 2.0, trapezio.getBaseMenor(), 0.0001);
        assertEquals(5.0 * 2.0, trapezio.getAltura(), 0.0001);
    }
}

