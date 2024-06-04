package ObserverMVC.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ObserverMVC.controller.AssentoNaoDisponivelException;
import ObserverMVC.controller.AssentoNaoEncontradoException;
import ObserverMVC.controller.OnibusModelSource;
import ObserverMVC.model.Assentos;
import ObserverMVC.model.StatusEnum;

public class OnibusModelSourceTest {

    private OnibusModelSource onibusModel;

    @Before
    public void setUp() {
        onibusModel = new OnibusModelSource();
    }

    @Test
    public void testReservarAssentoDisponivel() throws AssentoNaoDisponivelException, AssentoNaoEncontradoException {
        onibusModel.reservarAssento(1);
        List<Assentos> assentos = onibusModel.getAssentos();
        assertEquals(StatusEnum.RESERVADO, assentos.get(0).getStatus());
    }

    @Test
    public void testReservarAssentoNaoDisponivel() {
        AssentoNaoDisponivelException thrown = assertThrows(
            AssentoNaoDisponivelException.class,
            () -> onibusModel.reservarAssento(4) // Assento indisponível
        );
        assertTrue(thrown.getMessage().contains("O assento não está disponível para reserva."));
    }

    @Test
    public void testReservarAssentoNaoEncontrado() {
        AssentoNaoEncontradoException thrown = assertThrows(
            AssentoNaoEncontradoException.class,
            () -> onibusModel.reservarAssento(10) // Assento não existe
        );
        assertTrue(thrown.getMessage().contains("Assento não encontrado com o número fornecido."));
    }

    @Test
    public void testGetAssentos() {
        List<Assentos> assentos = onibusModel.getAssentos();
        assertEquals(4, assentos.size());
    }

    @Test
    public void testSetAssentos() {
        Assentos novoAssento = new Assentos(5, StatusEnum.DISPONIVEL);
        List<Assentos> novosAssentos = List.of(novoAssento);
        onibusModel.setAssentos(novosAssentos);
        List<Assentos> assentos = onibusModel.getAssentos();
        assertEquals(1, assentos.size());
        assertEquals(5, assentos.get(0).getNumero());
    }
}
