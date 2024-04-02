package test;
import org.junit.Test;

import src.BrincandoComAsFigurasGeometricas;
import src.Circulo;
import src.Quadrado;
import src.Retangulo;

import static org.junit.Assert.assertEquals;

public class BrincandoComAsFigurasGeometricasTest {

    @Test
    public void testSomaDasAreas() {
        Quadrado q = new Quadrado(3);
        Circulo c = new Circulo(4);
        Retangulo r = new Retangulo(10, 5);

        double somaEsperada = q.calculaArea() + c.calculaArea() + r.calculaArea();
        assertEquals(somaEsperada, BrincandoComAsFigurasGeometricas.somaDasAreas(q, r, c), 0.01);
    }
}
