package ObserverMVC.test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ObserverMVC.model.Assentos;
import ObserverMVC.model.StatusEnum;
import ObserverMVC.view.PainelCentral;

public class PainelCentralTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testUpdate() {
        // Cria uma lista de assentos para testar
        List<Assentos> assentos = Arrays.asList(
            new Assentos(1, StatusEnum.DISPONIVEL),
            new Assentos(2, StatusEnum.RESERVADO),
            new Assentos(3, StatusEnum.INDISPONIVEL)
        );

        // Cria uma instância do PainelCentral e chama o método update
        PainelCentral painelCentral = new PainelCentral();
        painelCentral.update(assentos);

        // Define a saída esperada
        String expectedOutput = "Painel Central: Atualização nos assentos recebida:\n"
                + "Assento 1: \033[32mDISPONIVEL\033[0m\n"
                + "Assento 2: \033[33mRESERVADO\033[0m\n"
                + "Assento 3: \033[31mINDISPONIVEL\033[0m\n";

        // Compara a saída real com a esperada, ignorando diferenças de nova linha
        assertEquals(expectedOutput.replace("\n", System.lineSeparator()), outContent.toString());
    }
}
