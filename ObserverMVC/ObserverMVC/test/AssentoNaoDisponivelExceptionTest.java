package ObserverMVC.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ObserverMVC.controller.AssentoNaoDisponivelException;

public class AssentoNaoDisponivelExceptionTest {

    @Test
    public void testAssentoNaoDisponivelExceptionMessage() {
        String errorMessage = "Assento não está disponível";
        
        // Usando assertThrows para verificar se a exceção é lançada e capturando a exceção
        AssentoNaoDisponivelException exception = assertThrows(
            AssentoNaoDisponivelException.class, 
            () -> { throw new AssentoNaoDisponivelException(errorMessage); }
        );

        // Verificando se a mensagem da exceção está correta
        assertEquals(errorMessage, exception.getMessage());
    }
}

    