package test;

import elements.*;
import org.junit.Before;
import org.junit.Test;
import visitors.DesenhoVisitor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DesenhoVisitorTest {
    private DesenhoVisitor visitor;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        visitor = new DesenhoVisitor();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testVisitarCirculo() {
        Circulo circulo = new Circulo(3.0);
        visitor.visitarCirculo(circulo);
        String expectedOutput = String.format("Círculo{ raio = %.2f }%n", 3.0);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testVisitarTriangulo() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        visitor.visitarTriangulo(triangulo);
        String expectedOutput = triangulo.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testVisitarRetangulo() {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        visitor.visitarRetangulo(retangulo);
        String expectedOutput = retangulo.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3.0, 4.0, 5.0);
        visitor.visitarTrapezio(trapezio);
        String expectedOutput = trapezio.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}

