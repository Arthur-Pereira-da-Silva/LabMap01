package src.SistemaDeApoio;

import java.util.ArrayList;

import src.Subsistemas.Aluno;
import src.Subsistemas.Professor;

public class Disciplina {
    
    private Horario horario = new Horario();
    private String nome;

    private Professor professor;

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public Disciplina(int ano, int mes, int dia, int hora, int minuto, String nome) {
        this.nome = nome;
        this.horario.setData(ano, mes, dia, hora, minuto, 0);
    }
    
    public Horario getHorario() {
        return horario;
    }
    
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    public void setHorario (int ano, int mes, int dia, int hora, int minuto, int segundos) {
        this.horario.setData(ano, mes, dia, hora, minuto, segundos);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Boolean addAluno(Aluno aluno){
        try{
            alunos.add(aluno);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public String toString () {
        return "Disciplina: " + nome + "Horário: " + horario.toString();
    }
}
