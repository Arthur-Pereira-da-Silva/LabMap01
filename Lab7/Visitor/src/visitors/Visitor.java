package visitors;

import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;

public interface Visitor {
    double visitarCirculo(Circulo c);

    double visitarTriangulo(Triangulo t);

    double visitarRetangulo(Retangulo r);

    double visitarTrapezio(Trapezio t);
}