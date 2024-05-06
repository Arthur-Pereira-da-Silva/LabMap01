public class SingletonCriaFiguras {
    private static SingletonCriaFiguras instância;
    private Circulo circulo;   
    private TrianguloIsosceles trianguloIsosceles;
    private TrianguloEscaleno trianguloEscaleno;
    private TrianguloEquilatero trianguloEquilatero;
    
    private SingletonCriaFiguras(){}

    public static SingletonCriaFiguras getInstancia(){
        if(instância == null){
            instância = new SingletonCriaFiguras();
        }
        return instância;
    }

    public Circulo criaCirculo(double raio){
        if(circulo == null){
            return circulo = new Circulo(raio);
        }
        return circulo;
    }

    public TrianguloEscaleno criaTrianguloEscaleno(double lado1, double lado2, double lado3) throws TrianguloException{
        if(trianguloEscaleno == null){
            return trianguloEscaleno = new TrianguloEscaleno(lado1, lado2, lado3);
        }
        return trianguloEscaleno;
    }

    public TrianguloIsosceles criaTrianguloIsosceles(double lado1, double lado2, double lado3) throws TrianguloException{
        if(trianguloIsosceles == null){
            return trianguloIsosceles = new TrianguloIsosceles(lado1, lado2, lado3);
        }
        return trianguloIsosceles;
    }

    public TrianguloEquilatero criaTrianguloEquilatero(double lado1, double lado2, double lado3) throws TrianguloException{
        if(trianguloEquilatero == null){
            return trianguloEquilatero = new TrianguloEquilatero(lado1, lado2, lado3);
        }
        return trianguloEquilatero;
    }

    public Quadrado criaQuadrado(double altura, double largura){
        return new Quadrado(largura, altura);
    }

    public String verificaInstancias(Object objeto1, Object objeto2){
        if(objeto1.equals(objeto2)){
            return String.format("Sim!, os objetos são iguais!\n");
        }
        return String.format("Os objetos não são iguais!\n");
    }
}
