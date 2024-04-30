package test;
import src.SistemaDeApoio.*;
import src.Subsistemas.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class AlunoTest {

    private Aluno aluno;
    private Grade grade;
    private ArrayList<Grade> gradeAnteriores;

    @Before
    public void setUp() {
        grade = new Grade();
        gradeAnteriores = new ArrayList<>();

        aluno = new Aluno("João", grade);
    }

    @Test
    public void testGetGrade() {
        assertEquals(grade, aluno.getGrade());
    }

    @Test
    public void testSetGrade() {
        Grade novaGrade = new Grade();
        aluno.setGrade(novaGrade);
        assertEquals(novaGrade, aluno.getGrade());
    }

    @Test
    public void testGetGradeAnteriores() {
        assertEquals(gradeAnteriores, aluno.getGradeAnteriores());
    }

    
}

