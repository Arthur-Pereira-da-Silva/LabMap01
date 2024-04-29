package src.SistemaDeApoio;

public class Entrevista extends Meet {
    
    /*
     * Entrevista (Responsabilidades):
     * mudar a data
     * adicionar e retirar participantes
     * 
     * Classes adicionais:
     * Horário
     * 
     * Participantes:
     * Diretores
     * Professores
     * Alunos
     */

    
    public Entrevista(int ano, int mes, int dia, int hora, int minuto) {
        setHorario(ano, mes, dia, hora, minuto);
    }
    
    @Override
    public String toString() {
        return " Entrevista\nParticipantes:" + getParticipantes() + "" + getHorario().toString();
    }
}
