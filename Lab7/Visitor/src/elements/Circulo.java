package elements;

import java.util.Objects;

import visitors.Visitor;

public class Circulo implements FigurasGeometricas {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double aceitarVisita(Visitor v) {
        return v.visitarCirculo(this);
    }

    @Override
    public String toString() {
        return String.format("Círculo{ raio = %.2f }", raio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.raio, raio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(raio);
    }
}
