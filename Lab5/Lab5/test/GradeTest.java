package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SistemaDeApoio.Disciplina;
import src.SistemaDeApoio.Grade;

public class GradeTest {

    private Grade grade;
    private Disciplina disciplina1;
    private Disciplina disciplina2;

    @Before
    public void setUp() {
        grade = new Grade();

        disciplina1 = new Disciplina(2024, 4, 30, 10, 30, "Matemática");
        disciplina2 = new Disciplina(2024, 5, 1, 13, 0, "Física");
    }

    @Test
    public void testAddDisciplina() {
        assertTrue(grade.addDisciplina(disciplina1));
        assertTrue(grade.addDisciplina(disciplina2));
        assertEquals(2, grade.getDisciplinas().size());
    }

    @Test
    public void testRemoveDisciplina() {
        grade.addDisciplina(disciplina1);
        grade.addDisciplina(disciplina2);

        grade.removeDisciplina(1);
        assertEquals(1, grade.getDisciplinas().size());
        assertEquals(disciplina1, grade.getDisciplina(0));
    }

    @Test
    public void testGetDisciplina() {
        grade.addDisciplina(disciplina1);
        grade.addDisciplina(disciplina2);

        assertEquals(disciplina2, grade.getDisciplina(1));
    }

}
