package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import SIG.Sig;
import SistemaDeApoio.Sala;
import SistemaDeApoio.TiposDeSalas;

public class SigTest {
    
    private Sig sig;

    @Before
    public void setUp() {
        sig = new Sig();
    }

    @Test
    public void testAddSala() {
        Sala sala = sig.addSala(110, TiposDeSalas.AULA, "Sala de Aula");
        assertTrue(sig.getCct().getSalas().contains(sala));
    }

    @Test
    public void testRemoveSala() {
        Sala sala = sig.addSala(120, TiposDeSalas.AULA, "Sala de Aula");
        int initialSize = sig.getCct().getSalas().size();
        sig.removeSala(0);
        assertEquals(initialSize - 1, sig.getCct().getSalas().size());
    }
}
