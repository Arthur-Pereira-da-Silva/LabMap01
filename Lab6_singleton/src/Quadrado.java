public class Quadrado implements CriaFiguras{
    private double largura;
    private double altura;
    
    public Quadrado(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea(){
        return largura * altura;
    }
    @Override
    public double calculaPerimetro(){
        return 4 * largura;
    }

    @Override
    public String toString(){
        return String.format("Sua área total é de: %.2f\nSeu perímetro é: %.2f", calculaArea(), calculaPerimetro());
    }
}
