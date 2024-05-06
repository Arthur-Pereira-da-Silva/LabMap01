public class Circulo implements CriaFiguras{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString(){
        return String.format("Sua área total é de: %.2f\nSeu perímetro é: %.2f", calculaArea(), calculaPerimetro());
    }
}
