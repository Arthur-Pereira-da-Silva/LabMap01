package src;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        if (Double.isNaN(lado) || Double.isInfinite(lado) || lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser um número válido e maior que zero.");
        }
        this.lado = lado;
    }

    public double calculaArea() {
        return lado * lado;
    }

    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return String.format("Área do Quadrado: %.2f\nPerímetro do Quadrado: %.2f", calculaArea(), calculaPerimetro());
    }
}