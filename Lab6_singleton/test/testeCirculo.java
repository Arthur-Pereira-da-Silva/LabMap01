import org.junit.Test;
import static org.junit.Assert.*;

public class testeCirculo {

    @Test
    public void testCalculaArea() {
        Circulo circulo = new Circulo(5.0);
        double expectedArea = Math.PI * Math.pow(5.0, 2);
        double actualArea = circulo.calculaArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalculaPerimetro() {
        Circulo circulo = new Circulo(5.0);
        double expectedPerimetro = 2 * Math.PI * 5.0;
        double actualPerimetro = circulo.calculaPerimetro();
        assertEquals(expectedPerimetro, actualPerimetro, 0.001);
    }
}
