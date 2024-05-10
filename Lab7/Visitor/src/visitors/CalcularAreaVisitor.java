package visitors;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;

public class CalcularAreaVisitor implements Visitor {
    @Override
    public double visitarCirculo(Circulo c) {
        return Math.PI * Math.pow(c.getRaio(), 2);
    }

    @Override
    public double visitarTriangulo(Triangulo t) {
        double a = t.getA();
        double b = t.getB();
        double c = t.getC();

        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        return r.getBase() * r.getAltura();
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        return ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2.0;
    }
}