package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SistemaDeApoio.Grade;
import src.Subsistemas.Professor;

public class ProfessorTest {

    private Professor professor;

    @Before
    public void setUp() {
        professor = new Professor("Fulano");
    }


    @Test
    public void testSetGrade() {
        Grade novaGrade = new Grade();
        professor.setGrade(novaGrade);
        assertEquals(novaGrade, professor.getGrade());
    }

    @Test
    public void testGetSalario() {
        assertEquals(0, professor.getSalario(), 0); // Teste inicial para o salário ser 0
    }

    @Test
    public void testSetSalario() {
        professor.setSalario(3000); // Definir um novo salário
        assertEquals(3000, professor.getSalario(), 0); // Verificar se o novo salário foi definido corretamente
    }

    @Test
    public void testGetTempoDeCasa() {
        assertEquals(0, professor.getTempoDeCasa(), 0); // Teste inicial para o tempo de casa ser 0
    }

    @Test
    public void testSetTempoDeCasa() {
        professor.setTempoDeCasa(5); // Definir um novo tempo de casa
        assertEquals(5, professor.getTempoDeCasa(), 0); // Verificar se o novo tempo de casa foi definido corretamente
    }

}
