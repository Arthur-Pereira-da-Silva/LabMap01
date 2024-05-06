public class TrianguloException extends Exception{
    public TrianguloException(String mensagem) {
        super(mensagem);
    }

    public static Boolean validaTriangulo(double lado1, double lado2, double lado3){
        if(lado1 > Math.abs(lado2 - lado3) && lado1 < lado2 + lado3){
            return true;
        }
        else if(lado2 > Math.abs(lado1 - lado3) && lado2 < lado1 + lado3){
            return true;
        }
        else if(lado3 > Math.abs(lado1 - lado2) && lado3 < lado1 + lado3){
            return true;
        }
        else{
            return false;
        }
    }
}
