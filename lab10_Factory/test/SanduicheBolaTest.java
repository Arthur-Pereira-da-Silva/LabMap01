package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factories.SanduicheBolaFactory;
import factories.SanduicheFactory;

public class SanduicheBolaTest {

    @Test
    public void testSanduicheBolaFactory() {
        SanduicheFactory factory = new SanduicheBolaFactory();
        String resultado = factory.criarSanduiche();
        String esperado = "Preparando Sanduíche BOLA com:\n" +
                "Pão: Pão Bola\n" +
                "Queijo: Queijo Cheddar\n" +
                "Presunto: Presunto de Frango\n" +
                "Ovo: Ovo de Capoeira\n" +
                "Tomate: Tomate";
        assertEquals(esperado, resultado);
    }
    
}
