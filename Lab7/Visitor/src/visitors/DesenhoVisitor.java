package visitors;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;

public class DesenhoVisitor implements Visitor {
    @Override
    public double visitarCirculo(Circulo c) {
        System.out.printf("Círculo{ raio = %.2f }\n", c.getRaio());
        return 0;
    }

    @Override
    public double visitarTriangulo(Triangulo t) {
        System.out.println(t.toString());
        return 0;
    }

    @Override
    public double visitarRetangulo(Retangulo r) {
        System.out.println(r.toString());
        return 0;
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        System.out.println(t.toString());
        return 0;
    }
}
