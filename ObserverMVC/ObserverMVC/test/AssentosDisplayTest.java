package ObserverMVC.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ObserverMVC.model.Assentos;
import ObserverMVC.model.StatusEnum;
import ObserverMVC.view.AssentosDisplay;

public class AssentosDisplayTest {

    private AssentosDisplay assentosDisplay;

    @Before
    public void setUp() {
        assentosDisplay = new AssentosDisplay();
    }

    @Test
    public void testUpdate() {
        List<Assentos> assentosList = Arrays.asList(
                new Assentos(1, StatusEnum.DISPONIVEL),
                new Assentos(2, StatusEnum.RESERVADO),
                new Assentos(3, StatusEnum.INDISPONIVEL)
        );

        assentosDisplay.update(assentosList);

        assertNotNull(assentosList);
    }
}
