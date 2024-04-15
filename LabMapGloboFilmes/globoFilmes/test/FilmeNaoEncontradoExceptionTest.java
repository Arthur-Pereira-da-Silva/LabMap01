package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.tratamentoErros.FilmeNaoEncontradoException;

public class FilmeNaoEncontradoExceptionTest {

    @Test
    public void testFilmeNaoEncontradoException() {
        assertThrows(FilmeNaoEncontradoException.class, () -> {
            throw new FilmeNaoEncontradoException("Filme não encontrado!");
        });
    }
}
