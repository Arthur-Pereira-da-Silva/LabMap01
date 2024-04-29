package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import SistemaDeApoio.Entrevista;
import Subsistemas.Pessoa;

public class EntrevistaTest {

    private Entrevista enter = new Entrevista(2022, 12, 03, 13, 30);

    private Pessoa P1 = new Pessoa("Junior");
    private Pessoa P2 = new Pessoa("Neto");
    private Pessoa P3 = new Pessoa("Maria");
    private Pessoa P4 = new Pessoa("Ceica");
    private Pessoa P5 = new Pessoa("Cleiton");
    private ArrayList<Pessoa> participa = new ArrayList<Pessoa>();

    @Test
    void testAddParticipante() {

        participa.add(P1);
        participa.add(P2);
        participa.add(P3);
        participa.add(P4);
        participa.add(P5);

        enter.addParticipante(P1);
        enter.addParticipante(P2);
        enter.addParticipante(P3);
        enter.addParticipante(P4);
        enter.addParticipante(P5);

        assertEquals(participa, enter.getParticipantes());
    }

    @Test
    void testRemoveParticipante() {
        participa.add(P1);
        participa.add(P2);
        participa.add(P4);
        participa.add(P5);

        enter.addParticipante(P1);
        enter.addParticipante(P2);
        enter.addParticipante(P3);
        enter.addParticipante(P4);
        enter.addParticipante(P5);

        enter.removeParticipante(2);

        assertEquals(participa, enter.getParticipantes());
    }
}
