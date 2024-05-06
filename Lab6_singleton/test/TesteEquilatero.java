import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEquilatero {

    @Test
    public void testCalculaArea() throws TrianguloException {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(5.0, 5.0, 5.0);
        double expectedArea = 10.83;
        double delta = 0.01;
        assertEquals(expectedArea, triangulo.calculaArea(), delta);
    }

    @Test
    public void testCalculaPerimetro() throws TrianguloException{
        TrianguloEquilatero triangulo = new TrianguloEquilatero(3.0, 3.0, 3.0);
        double expectedPerimetro = 9.0;
        assertEquals(expectedPerimetro, triangulo.calculaPerimetro(), 0.0);
    }
    
    @Test(expected = TrianguloException.class)
    public void testInvalidTrianguloCreation() throws TrianguloException {
        new TrianguloEquilatero(3.0, 4.0, 5.0); // Deve lançar uma exceção, pois não é um triângulo equilátero.
    }
}
