package src.Subsistemas;

import src.SistemaDeApoio.Grade;

// Representa um professor com atributos específicos
public class Professor extends Pessoa {
	
    private float tempoDeCasa = 0;
    private Grade grade = new Grade();
    private Salario salario = new Salario();

    // Construtor
    public Professor(String nome) {
        super(nome);
        setTipo("Professor"); 
    }

    // Métodos getters e setters
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public float getSalario() {
        return salario.getValorSalario();
    }

    public void setSalario(float salario) {
        this.salario.setValorSalario(salario);
    }

    public float getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(float tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    // Método para exibir detalhes da grade
    public void showGrade() {
        grade.showDetalhes();
    }

    // Sobrescrita do método toString para fornecer informações sobre o professor
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n Função: " + getTipo() + "\nTempo de Casa: " + getTempoDeCasa() + " ]";
    }   
}
