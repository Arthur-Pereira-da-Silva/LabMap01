package src;

public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {
        try {
            Quadrado q1 = new Quadrado(3);
            Circulo c1 = new Circulo(4);
            Retangulo r1 = new Retangulo(10, 5);

            System.out.println(q1);
            System.out.println(c1);
            System.out.println(r1);

            var somaAreas = somaDasAreas(q1, r1, c1);
            System.out.printf("A soma das áreas é: %.2f\n", somaAreas);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: Valores inválidos fornecidos para uma figura geométrica.");
        }
    }

    public static double somaDasAreas(Quadrado q, Retangulo r, Circulo c) {
        return q.calculaArea() + r.calculaArea() + c.calculaArea();
    }
}