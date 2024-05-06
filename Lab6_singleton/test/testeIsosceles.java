import org.junit.Test;
import static org.junit.Assert.*;

public class testeIsosceles {

    @Test
    public void testCalculaArea() throws TrianguloException {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(4.0, 4.0, 5.0);
        double expectedArea = 7.806;
        double delta = 0.001;
        assertEquals(expectedArea, triangulo.calculaArea(), delta);
    }

    @Test
    public void testCalculaPerimetro() throws TrianguloException {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(3.0, 3.0, 4.0);
        double expectedPerimetro = 10.0;
        assertEquals(expectedPerimetro, triangulo.calculaPerimetro(), 0.0);
    }

    @Test(expected = TrianguloException.class)
    public void testInvalidTrianguloCreation() throws TrianguloException {
        new TrianguloIsosceles(2.0, 3.0, 5.0);
    }
}
