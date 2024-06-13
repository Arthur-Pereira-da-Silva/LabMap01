package test;

import static org.junit.Assert.*;
import factories.*;
import org.junit.Test;

public class SanduicheIntegralTest {

    @Test
    public void testSanduicheIntegralFactory() {
        SanduicheFactory factory = new SanduicheIntegralFactory();
        String resultado = factory.criarSanduiche();
        String esperado = "Preparando Sanduíche INTEGRAL com:\n" +
                "Pão: Pão Integral\n" +
                "Queijo: Queijo Prato\n" +
                "Presunto: Presunto de Frango\n" +
                "Ovo: Ovo de Capoeira\n" +
                "Tomate: Tomate";
        assertEquals(esperado, resultado);
    }
    
}
