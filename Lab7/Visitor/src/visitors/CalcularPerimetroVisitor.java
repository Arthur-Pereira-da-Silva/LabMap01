package visitors;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;

public class CalcularPerimetroVisitor implements Visitor {
    @Override
    public double visitarCirculo(Circulo c) {
        return 2.0 * Math.PI * c.getRaio();
    }

    @Override
    public double visitarTriangulo(Triangulo t) {
        return t.getA() + t.getB() + t.getC();
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        return 2.0 * (r.getBase() + r.getAltura());
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        return t.getBaseMaior() + t.getBaseMenor() + 2.0 * t.getAltura();
    }
}