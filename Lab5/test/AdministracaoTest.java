package test;
import src.SistemaDeApoio.*;
import src.Subsistemas.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class AdministracaoTest {

    private Administracao administracao;
    private Reuniao reuniao;
    private Entrevista entrevista;

    @Before
    public void setUp() {
        administracao = new Administracao();
    }

    @Test
    public void testAddReuniao() {
        reuniao = administracao.addReuniao(2024, 4, 30, 10, 30);
        assertEquals(1, administracao.getReunioes().size());
        assertEquals(reuniao, administracao.getMeet(0));
    }

    @Test
    public void testAddEntrevista() {
        entrevista = administracao.addEntrevista(2024, 5, 1, 13, 0);
        assertEquals(1, administracao.getReunioes().size());
        assertEquals(entrevista, administracao.getMeet(0));
    }

    @Test
    public void testRemoveMeet() {
        administracao.addReuniao(2024, 4, 30, 10, 30);
        assertTrue(administracao.removeMeet(0));
        assertEquals(0, administracao.getReunioes().size());
    }


    @Test
    public void testAlterarParticipantes() {
        Reuniao reuniao = administracao.addReuniao(2024, 4, 30, 10, 30);
        ArrayList<Pessoa> participantes = new ArrayList<>();
        participantes.add(new Pessoa("João"));
        participantes.add(new Pessoa("Maria"));
        administracao.alterarParticipantes(0, participantes);
        assertEquals(participantes, reuniao.getParticipantes());
    }

}

