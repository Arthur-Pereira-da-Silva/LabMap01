package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SistemaDeApoio.Disciplina;
import src.SistemaDeApoio.Grade;
import src.Subsistemas.Aluno;
import src.Subsistemas.Professor;

public class DisciplinaTest {

    private Disciplina disciplina;
    private Aluno aluno1;
    private Aluno aluno2;
    private Professor professor;

    @Before
    public void setUp() {
        disciplina = new Disciplina(2024, 4, 30, 10, 30, "Matemática");

        aluno1 = new Aluno("João");
        aluno2 = new Aluno("Maria");

        professor = new Professor("Fulano");
    }

    @Test
    public void testAddAluno() {
        assertTrue(disciplina.addAluno(aluno1));
        assertTrue(disciplina.addAluno(aluno2));
        assertEquals(2, disciplina.getAlunos().size());
    }

    @Test
    public void testSetProfessor() {
        disciplina.setProfessor(professor);
        assertEquals(professor, disciplina.getProfessor());
    }

    @Test
    public void testNomeDisciplina() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testAddAlunoComGrade() {
        // Criar alunos com grades
        Aluno alunoComGrade1 = new Aluno("Pedro", new Grade());
        Aluno alunoComGrade2 = new Aluno("Ana", new Grade());

        // Adicionar alunos com grades
        assertTrue(disciplina.addAluno(alunoComGrade1));
        assertTrue(disciplina.addAluno(alunoComGrade2));

        // Verificar se os alunos foram adicionados corretamente
        assertEquals(2, disciplina.getAlunos().size());
    }

    @Test
    public void testAddProfessor() {
        disciplina.setProfessor(professor);
        assertEquals(professor, disciplina.getProfessor());
    }
}