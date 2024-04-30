package src.SistemaDeApoio;

import java.util.ArrayList;

import src.Subsistemas.Pessoa;

public class Meet{

	private Horario horario = new Horario();

	private ArrayList<Pessoa> participantes = new ArrayList<Pessoa>(); 
	
	public void setHorario(int ano, int mes, int dia, int hora, int minuto) {
		horario.setData(ano, mes, dia, hora, minuto, 0);
	}
	
	public Horario getHorario(){
		return horario;
	}

	public void setParticipantes(ArrayList<Pessoa> participantes) {
		this.participantes = participantes;
	}

	public ArrayList<Pessoa> getParticipantes(){
		return participantes;
	}

	public void addParticipante(Pessoa e) {
		participantes.add(e);
	}

	public void removeParticipante(int index) {
		participantes.remove(index);
	}
}
