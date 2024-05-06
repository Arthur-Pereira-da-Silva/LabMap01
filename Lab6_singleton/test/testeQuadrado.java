import org.junit.Test;
import static org.junit.Assert.*;

public class testeQuadrado {

    @Test
    public void testCalculaArea() {
        Quadrado quadrado = new Quadrado(5.0, 5.0);
        double expectedArea = 25.0;
        assertEquals(expectedArea, quadrado.calculaArea(), 0.0);
    }

    @Test
    public void testCalculaPerimetro() {
        Quadrado quadrado = new Quadrado(3.0, 3.0);
        double expectedPerimetro = 12.0;
        assertEquals(expectedPerimetro, quadrado.calculaPerimetro(), 0.0);
    }

}
