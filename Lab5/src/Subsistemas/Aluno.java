package src.Subsistemas;

import java.util.ArrayList;

import src.SistemaDeApoio.Grade;

public class Aluno extends Pessoa{

	private Grade grade = new Grade();
	private ArrayList<Grade> gradeAnteriores = new ArrayList<Grade>();

	
	public Aluno(String nome, Grade grade) {
		super(nome);
		this.grade = grade;
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, Grade grade, ArrayList<Grade> gradeAnteriores) {
		super(nome);
		this.grade = grade;
		this.gradeAnteriores = gradeAnteriores;
	}

    public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public ArrayList<Grade> getGradeAnteriores() {
		return gradeAnteriores;
	}

	public void showHistorico() {
		for (int i = 0; i < gradeAnteriores.size(); i++) {
			System.out.println(gradeAnteriores.get(i).toString());
		}
	}
	
	public void showGrade() {
		grade.showDetalhes();
	}
}