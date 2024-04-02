package src;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        if (Double.isNaN(raio) || Double.isInfinite(raio) || raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser um número válido e maior que zero.");
        }
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return String.format("Área do Círculo: %.2f\nPerímetro do Círculo: %.2f", calculaArea(), calculaPerimetro());
    }
}