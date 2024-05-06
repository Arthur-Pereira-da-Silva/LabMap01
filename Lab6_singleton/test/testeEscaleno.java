import org.junit.Test;
import static org.junit.Assert.*;

public class testeEscaleno {

    @Test
    public void testCalculaArea() throws TrianguloException {
        TrianguloEscaleno triangulo = new TrianguloEscaleno(6.0, 7.0, 8.0);
        double expectedArea = 20.33;
        double delta = 0.01;
        assertEquals(expectedArea, triangulo.calculaArea(), delta);
    }

    @Test
    public void testCalculaPerimetro() throws TrianguloException {
        TrianguloEscaleno triangulo = new TrianguloEscaleno(3.0, 4.0, 5.0);
        double expectedPerimetro = 12.0;
        assertEquals(expectedPerimetro, triangulo.calculaPerimetro(), 0.0);
    }

    @Test(expected = TrianguloException.class)
    public void testInvalidTrianguloCreation() throws TrianguloException {
        new TrianguloEscaleno(2.0, 2.0, 5.0);
    }
}
