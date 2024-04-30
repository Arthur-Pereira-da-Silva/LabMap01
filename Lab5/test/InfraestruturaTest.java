package test;
import src.SistemaDeApoio.*;
import src.Subsistemas.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InfraestruturaTest {

    private Infra_estrutura infraestrutura;

    @Before
    public void setUp() {
        infraestrutura = new Infra_estrutura();
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

