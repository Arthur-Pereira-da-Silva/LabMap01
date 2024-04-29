package src.SistemaDeApoio;

// Representa uma reunião
public class Reuniao extends Meet {

    // Construtor que define o horário da reunião
    public Reuniao(int ano, int mes, int dia, int hora, int minuto) {
        setHorario(ano, mes, dia, hora, minuto);
    }

    // Sobrescrita do método toString para fornecer informações sobre a reunião
    @Override
    public String toString() {
        return "Reunião\nParticipantes:" + getParticipantes() + "" + getHorario().toString();
    }
}
