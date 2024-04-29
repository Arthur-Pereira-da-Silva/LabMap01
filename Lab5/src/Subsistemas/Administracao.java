package src.Subsistemas;

import java.util.ArrayList;

import src.SistemaDeApoio.Entrevista;
import src.SistemaDeApoio.Horario;
import src.SistemaDeApoio.Meet;
import src.SistemaDeApoio.Reuniao;

//(reuniões agendadas com a diretoria, entrevistas);
public class Administracao {
	
	private ArrayList<Meet> encontros = new ArrayList<Meet>();
	
	/*
	 * Administracao (Responsabilidades):
	 * Agendar reunião
	 * remover reunião
	 * alterar reunião
	 * Exibir detalhes de uma reunião
	 * agendar entrevista
	 * remover entrevista
	 * alterar entrevista
	 * 
	 */

	public Administracao(){}
	
	public ArrayList<Meet> getReunioes() {
		return encontros;
	}

	public void setEncontros(ArrayList<Meet> encontros) {
		this.encontros = encontros;
	}

	public Meet getMeet(int index) {
		return encontros.get(index);
	}
	
	public Reuniao addReuniao(int ano, int mes, int dia, int hora, int minuto) {
		Reuniao reuniao = new Reuniao(ano, mes, dia, hora, minuto);
		encontros.add(reuniao);
		return reuniao;
	}

	public Entrevista addEntrevista(int ano, int mes, int dia, int hora, int minuto) {
		Entrevista entrevista = new Entrevista(ano, mes, dia, hora, minuto);
		encontros.add(entrevista);
		return entrevista;
	}
	
	public Boolean removeMeet(int index) {
		try {
			encontros.remove(index);
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	public Horario alterarHorario(int index, int ano, int mes, int dia, int hora, int minuto) {
		encontros.get(index).setHorario(ano, mes, dia, hora, minuto);
		return encontros.get(index).getHorario();
	}
	
	public ArrayList<Pessoa> alterarParticipantes(int index, ArrayList<Pessoa> participantes) {
		encontros.get(index).setParticipantes(participantes);
		return encontros.get(index).getParticipantes();
	}
	
	public void verEncontro(int index) {
		System.out.println(encontros.get(index).toString());
	}
	
	public void verTodosEncontros() {
		for(int i = 0; i < encontros.size(); i++) {
			System.out.println("Entrevista " + (i+1) + ":");
			for(int j = 0; j < encontros.get(i).getParticipantes().size(); j++){
				System.out.println(encontros.get(i).getParticipantes().get(j).getNome());
			}
			System.out.println("");
		}
	}
}

