package src.SistemaDeApoio;

import java.util.Calendar;

public class Horario {

    private Calendar data;

    public Horario() {
        data = Calendar.getInstance();
    }

    public Horario(Calendar data) {
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setData(int ano, int mes, int dia, int hora, int minuto, int segundos) {
        data.set(Calendar.YEAR, ano);
        data.set(Calendar.MONTH, mes);
        data.set(Calendar.DAY_OF_MONTH, dia);
        data.set(Calendar.HOUR, hora);
        data.set(Calendar.MINUTE, minuto);
        data.set(Calendar.SECOND, segundos);
    }

    @Override
    public String toString() {
        return "Data do evento:\n" +
                data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH) + 1) + "/" + data.get(Calendar.YEAR) +
                "\nHora: " + data.getTime();
    }
}
