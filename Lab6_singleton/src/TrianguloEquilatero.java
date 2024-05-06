public class TrianguloEquilatero implements CriaFiguras{
    private double lado1;
    private double lado2;
    private double lado3;
    
    public TrianguloEquilatero(double lado1, double lado2, double lado3) throws TrianguloException {
        if(!(lado1 == lado2 && lado1 == lado3 && lado2 == lado3)){
            throw new TrianguloException("Não foi possível criar o triângulo, pois ele não é um triângulo equilatero");
        }
        else if(TrianguloException.validaTriangulo(lado1, lado2, lado3) == false) {
            throw new TrianguloException("Não foi possível criar o triângulo, pois um de seus lados não segue a regra de existência!");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calculaArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    @Override
    public double calculaPerimetro(){
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString(){
        return String.format("Sua área total é de: %.2f\nSeu perímetro é: %.2f", calculaArea(), calculaPerimetro());
    }
}
