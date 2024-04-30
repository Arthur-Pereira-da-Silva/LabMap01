package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SistemaDeApoio.Sala;
import src.SistemaDeApoio.TiposDeSalas;
import src.Subsistemas.Infraestrutura;

public class InfraestruturaTest {

    private Infraestrutura infraestrutura;

    @Before
    public void setUp() {
        infraestrutura = new Infraestrutura();
    }

    @Test
    public void testAddSala() {
        assertTrue(infraestrutura.addSala(new Sala(101, TiposDeSalas.AULA)));
    }

    @Test
    public void testAddSalaWithParams() {
        assertTrue(infraestrutura.addSala(101, TiposDeSalas.AULA));
    }

    @Test
    public void testRemoveSala() {
        infraestrutura.addSala(101, TiposDeSalas.AULA);
        assertTrue(infraestrutura.removeSala(0));
    }

}
