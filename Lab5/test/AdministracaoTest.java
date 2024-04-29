package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import SistemaDeApoio.Entrevista;
import SistemaDeApoio.Meet;
import SistemaDeApoio.Reuniao;
import Subsistemas.Administracao;

public class AdministracaoTest {

    private Administracao adm = new Administracao();

    @Test
    void testAddReuniao() {

        Reuniao novo = new Reuniao(2022, 12, 03, 13, 30);

        Reuniao test = adm.addReuniao(2022, 12, 03, 13, 30);

        assertEquals(novo.getHorario(), test.getHorario());
    }
    @Test
    void testAddEntrevista() {

        Entrevista novo = new Entrevista(2022, 12, 03, 13, 30);

        Entrevista test = adm.addEntrevista(2022, 12, 03, 13, 30);

        assertEquals(novo.getHorario(), test.getHorario());
    }

    @Test
    void testRemoveMeet() {

        adm.addReuniao(2022, 12, 03, 13, 30);

        adm.getReunioes().remove(0);

        ArrayList<Meet> test = new ArrayList<Meet>();

        assertEquals(test, adm.getReunioes());

    }
}
