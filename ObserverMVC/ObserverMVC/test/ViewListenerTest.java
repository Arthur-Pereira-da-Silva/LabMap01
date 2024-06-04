package ObserverMVC.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ObserverMVC.controller.ViewListener;
import ObserverMVC.model.Assentos;
import ObserverMVC.model.StatusEnum;

public class ViewListenerTest {

    private ViewListener viewListener;
    private List<Assentos> assentosList;

    @Before
    public void setUp() {
        viewListener = new ViewListener();
        assentosList = new ArrayList<>();
        assentosList.add(new Assentos(1, StatusEnum.DISPONIVEL));
        assentosList.add(new Assentos(2, StatusEnum.RESERVADO));
        assentosList.add(new Assentos(3, StatusEnum.INDISPONIVEL));
    }

    @Test
    public void testUpdate() {
        viewListener.update(assentosList);
        assertEquals(assentosList, viewListener.getAssentos());
    }

    @Test
    public void testSetAndGetAssentos() {
        viewListener.setAssentos(assentosList);
        assertEquals(assentosList, viewListener.getAssentos());
    }

    @Test
    public void testMostrarAssentos() {
        viewListener.setAssentos(assentosList);
        viewListener.mostrarAssentos();
    }
}