package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.tratamentoErros.FuncionarioNaoEncontradoException;

public class FuncionarioNaoEncontradoExceptionTest {

    @Test
    public void testFuncionarioNaoEncontradoException() {
        assertThrows(FuncionarioNaoEncontradoException.class, () -> {
            throw new FuncionarioNaoEncontradoException("José");
        });
    }
}
