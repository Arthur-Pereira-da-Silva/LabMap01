public class Main{
    public static void main(String[] args) throws TrianguloException {
        var instanciaSingleton = SingletonCriaFiguras.getInstancia();
        
        var circulo1 = instanciaSingleton.criaCirculo(10);
        System.out.println(circulo1);

        var circulo2 = instanciaSingleton.criaCirculo(20);
        System.out.println(instanciaSingleton.verificaInstancias(circulo1, circulo2));

        var trianguloEquilatero = instanciaSingleton.criaTrianguloEquilatero(3, 3, 3);
        System.out.println(trianguloEquilatero);

        var trianguloEquilatero2 = instanciaSingleton.criaTrianguloEquilatero(4, 4, 4);
        System.out.println(instanciaSingleton.verificaInstancias(trianguloEquilatero, trianguloEquilatero2));

        var trianguloIsosceles = instanciaSingleton.criaTrianguloIsosceles(7, 7, 9);
        System.out.println(trianguloIsosceles);

        var trianguloIsosceles2 = instanciaSingleton.criaTrianguloIsosceles(10, 10, 12);
        System.out.println(instanciaSingleton.verificaInstancias(trianguloIsosceles, trianguloIsosceles2));

        var trianguloEscaleno = instanciaSingleton.criaTrianguloEscaleno(4, 5, 6);
        System.out.println(trianguloEscaleno);

        var trianguloEscaleno2 = instanciaSingleton.criaTrianguloEscaleno(7, 8, 9);
        System.out.println(instanciaSingleton.verificaInstancias(trianguloEscaleno, trianguloEscaleno2));

        Quadrado quadrado1 = instanciaSingleton.criaQuadrado(5,4);
        System.out.println(quadrado1);
        Quadrado quadrado2 = instanciaSingleton.criaQuadrado(2,2);
        System.out.println(instanciaSingleton.verificaInstancias(quadrado1, quadrado2));
    }
}
