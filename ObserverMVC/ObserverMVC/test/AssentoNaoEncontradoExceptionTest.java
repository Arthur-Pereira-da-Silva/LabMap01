package ObserverMVC.test;
import static org.junit.Assert.*;

import org.junit.Test;

import ObserverMVC.controller.AssentoNaoEncontradoException;

public class AssentoNaoEncontradoExceptionTest {

    @Test
    public void testAssentoNaoEncontradoExceptionMessage() {
        String errorMessage = "Assento não encontrado";
        
        // Usando assertThrows para verificar se a exceção é lançada e capturando a exceção
        AssentoNaoEncontradoException exception = assertThrows(
            AssentoNaoEncontradoException.class, 
            () -> { throw new AssentoNaoEncontradoException(errorMessage); }
        );

        // Verificando se a mensagem da exceção está correta
        assertEquals(errorMessage, exception.getMessage());
    }
}
