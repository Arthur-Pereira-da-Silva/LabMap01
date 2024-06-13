package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factories.SanduicheFactory;
import factories.SanduicheFrancesFactory;

public class SanduicheFrancesTest {

    @Test
    public void testSanduicheFrancesFactory() {
        SanduicheFactory factory = new SanduicheFrancesFactory();
        String resultado = factory.criarSanduiche();
        String esperado = "Preparando Sanduíche FRANCÊS com:\n" +
                "Pão: Pão Francês\n" +
                "Queijo: Queijo Mussarela\n" +
                "Presunto: Presunto de Peru\n" +
                "Ovo: Ovo de Granja\n" +
                "Tomate: Tomate";
        assertEquals(esperado, resultado);
    }
    
}
