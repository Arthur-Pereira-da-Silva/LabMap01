package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Subsistemas.Financeiro;
import src.Subsistemas.Professor;
import src.Subsistemas.Salario;

public class FinanceiroTest {

    private Financeiro financeiro;

    @Before
    public void setUp() {
        financeiro = new Financeiro();
    }

    @Test
    public void testAddPagamento() {
        Professor professor = new Professor("Fulano");
        Salario pagamento = financeiro.addPagamento(professor, 3000);
        assertEquals(1, financeiro.getFolhaDePagamento().size());
        assertEquals(pagamento, financeiro.getFolhaDePagamento().get(0));
    }

    @Test
    public void testValorTotal() {
        Professor professor1 = new Professor("Fulano");
        Professor professor2 = new Professor("Ciclano");
        financeiro.addPagamento(professor1, 3000);
        financeiro.addPagamento(professor2, 2500);

        assertEquals(5500, financeiro.valorTotal(), 0);
    }

    @Test
    public void testToString() {
        assertEquals("Folha de pagamento [ [] ]", financeiro.toString());
    }
}
