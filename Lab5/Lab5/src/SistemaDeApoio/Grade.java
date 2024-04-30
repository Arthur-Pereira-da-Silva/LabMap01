package src.SistemaDeApoio;

import java.util.ArrayList;

public class Grade {
    
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public Disciplina getDisciplina(int index) {
        return disciplinas.get(index);
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public Boolean addDisciplina(Disciplina e) {
        try {
            disciplinas.add(e);
        } catch (Exception i) {
            return false;
        }
        return true;
    }

    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }
    
    public void showDetalhes() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(disciplinas.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Disciplinas alocadas: " + "[" + disciplinas + "]";
    }
}
