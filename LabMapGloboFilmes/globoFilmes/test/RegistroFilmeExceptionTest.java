package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.tratamentoErros.RegistroFilmeException;

public class RegistroFilmeExceptionTest {

    @Test
    public void testRegistroFilmeException() {
        assertThrows(RegistroFilmeException.class, () -> {
            throw new RegistroFilmeException("Erro ao registrar filme!");
        });
    }
}
