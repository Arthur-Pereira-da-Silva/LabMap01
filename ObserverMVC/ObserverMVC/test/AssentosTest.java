package ObserverMVC.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ObserverMVC.model.Assentos;
import ObserverMVC.model.StatusEnum;

public class AssentosTest {

    @Test
    public void testGetNumero() {
        Assentos assento = new Assentos(1, StatusEnum.DISPONIVEL);
        assertEquals(1, assento.getNumero());
    }

    @Test
    public void testGetStatus() {
        Assentos assento = new Assentos(1, StatusEnum.DISPONIVEL);
        assertEquals(StatusEnum.DISPONIVEL, assento.getStatus());
    }

    @Test
    public void testSetStatus() {
        Assentos assento = new Assentos(1, StatusEnum.DISPONIVEL);
        assento.setStatus(StatusEnum.RESERVADO);
        assertEquals(StatusEnum.RESERVADO, assento.getStatus());
    }

    @Test
    public void testGetStatusColorido() {
        Assentos assentoDisponivel = new Assentos(1, StatusEnum.DISPONIVEL);
        assertEquals("\033[32mDISPONIVEL\033[0m", assentoDisponivel.getStatusColorido());

        Assentos assentoReservado = new Assentos(1, StatusEnum.RESERVADO);
        assertEquals("\033[33mRESERVADO\033[0m", assentoReservado.getStatusColorido());

        Assentos assentoIndisponivel = new Assentos(1, StatusEnum.INDISPONIVEL);
        assertEquals("\033[31mINDISPONIVEL\033[0m", assentoIndisponivel.getStatusColorido());
    }
}
