package src.Subsistemas;

public class Salario {

    private Professor professor;
    private float valorSalario;
    
    public Salario(Professor professor, float valorSalario){
        this.professor = professor;
        this.valorSalario = valorSalario;
    }

    public Salario() {
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public float getValorSalario() {
        return valorSalario;
    }
    
    public void setValorSalario(float valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        return "Nome Professor: " + professor.getNome() + ", Valor do Salario: " + valorSalario;
    }
}
