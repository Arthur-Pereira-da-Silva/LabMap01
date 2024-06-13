package test;

import factories.SanduicheFactory;
import factories.SanduicheIntegralFactory;
import restaurante.Restaurante;
import factories.SanduicheFrancesFactory;
import factories.SanduicheBolaFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestauranteTest {

    @Test
    public void testObterFactoryIntegral() {
        SanduicheFactory factory = Restaurante.obterFactory("integral");
        assertTrue(factory instanceof SanduicheIntegralFactory);
    }

    @Test
    public void testObterFactoryFrances() {
        SanduicheFactory factory = Restaurante.obterFactory("frances");
        assertTrue(factory instanceof SanduicheFrancesFactory);
    }

    @Test
    public void testObterFactoryBola() {
        SanduicheFactory factory = Restaurante.obterFactory("bola");
        assertTrue(factory instanceof SanduicheBolaFactory);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testObterFactoryTipoDesconhecido() {
        Restaurante.obterFactory("desconhecido");
    }
}

