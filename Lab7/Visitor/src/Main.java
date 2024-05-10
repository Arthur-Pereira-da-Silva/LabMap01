import elements.Circulo;
import elements.Retangulo;
import elements.Trapezio;
import elements.Triangulo;
import visitors.CalcularAreaVisitor;
import visitors.CalcularPerimetroVisitor;
import visitors.DesenhoVisitor;
import visitors.MaximizarVisitor;
import visitors.Visitor;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 10, 12);
        Retangulo retangulo = new Retangulo(40, 20);
        Circulo circulo = new Circulo(5);
        Trapezio trapezio = new Trapezio(20, 10, 15);

        Visitor calcularArea = new CalcularAreaVisitor();
        Visitor desenhar = new DesenhoVisitor();
        Visitor calcularPerimetro = new CalcularPerimetroVisitor();
        Visitor maximizar = new MaximizarVisitor();

        System.out.println("===== Formas / Desenhos =====\n");

        System.out.println("Desenhando Circulo:");
        circulo.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Retangulo:");
        retangulo.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Trapezio:");
        trapezio.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Triangulo:");
        triangulo.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("===== Areas =====\n");

        System.out.println("Área do Circulo: " + circulo.aceitarVisita(calcularArea));
        System.out.println("Área do Retangulo: " + retangulo.aceitarVisita(calcularArea));
        System.out.println("Área do Trapezio: " + trapezio.aceitarVisita(calcularArea));
        System.out.println("Área do Triangulo: " + triangulo.aceitarVisita(calcularArea));
        System.out.println();

        System.out.println("===== Perimetros =====\n");

        System.out.println("Perimetro do Circulo: " + circulo.aceitarVisita(calcularPerimetro));
        System.out.println("Perimetro do Retangulo: " + retangulo.aceitarVisita(calcularPerimetro));
        System.out.println("Perimetro do Trapezio: " + trapezio.aceitarVisita(calcularPerimetro));
        System.out.println("Perimetro do Triangulo: " + triangulo.aceitarVisita(calcularPerimetro));
        System.out.println();

        circulo.aceitarVisita(maximizar);
        retangulo.aceitarVisita(maximizar);
        trapezio.aceitarVisita(maximizar);
        triangulo.aceitarVisita(maximizar);

        System.out.println("===== Maximizado =====\n");

        System.out.println("Desenhando Circulo Maximizado:");
        circulo.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Retangulo Maximizado:");
        retangulo.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Trapezio Maximizado:");
        trapezio.aceitarVisita(desenhar);
        System.out.println();

        System.out.println("Desenhando Triangulo Maximizado:");
        triangulo.aceitarVisita(desenhar);
    }
}
