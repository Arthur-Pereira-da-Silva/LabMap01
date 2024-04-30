package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SistemaDeApoio.Item;
import src.Subsistemas.Almoxarifado;

public class AlmoxarifadoTest {

    private Almoxarifado almoxarifado;

    @Before
    public void setUp() {
        almoxarifado = new Almoxarifado();
    }

    @Test
    public void testAddItem() {
        assertTrue(almoxarifado.addItem(1, new Item(100, "Lápis")));
        assertTrue(almoxarifado.addItem(2, new Item(50, "Caneta")));
    }

    @Test
    public void testRemoveItem() {
        almoxarifado.addItem(1, new Item(100, "Lápis"));
        almoxarifado.addItem(2, new Item(50, "Caneta"));

        assertTrue(almoxarifado.removeItem(1, 0));
        assertTrue(almoxarifado.removeItem(2, 0));
    }

    @Test
    public void testGetGastosTotais() {
        almoxarifado.addItem(1, new Item(100, "Lápis"));
        almoxarifado.addItem(2, new Item(50, "Caneta"));

        assertEquals(150, almoxarifado.getGastosTotais(), 0);
    }

}
