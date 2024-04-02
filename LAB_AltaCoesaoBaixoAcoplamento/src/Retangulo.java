package src;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        if (Double.isNaN(altura) || Double.isInfinite(altura) || Double.isNaN(largura) || Double.isInfinite(largura) || altura <= 0 || largura <= 0 || altura == largura) {
            throw new IllegalArgumentException("A altura e a largura do retângulo devem ser números válidos e maiores que zero, e diferentes uma da outra.");
        }
        this.altura = altura;
        this.largura = largura;
    }

    public double calculaArea() {
        return altura * largura;
    }

    public double calculaPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return String.format("Área do Retângulo: %.2f\nPerímetro do Retângulo: %.2f", calculaArea(), calculaPerimetro());
    }
}