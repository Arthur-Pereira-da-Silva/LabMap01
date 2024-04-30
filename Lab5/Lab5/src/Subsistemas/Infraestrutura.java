package src.Subsistemas;

import java.util.ArrayList;

import src.SistemaDeApoio.Sala;
import src.SistemaDeApoio.TiposDeSalas;

//(alocação de salas)
public class Infraestrutura {
	
	ArrayList<Sala> salas = new ArrayList<Sala>();

	public Infraestrutura (ArrayList<Sala> salas) {
		this.salas = salas;
	}
	
	public Infraestrutura () {}
	
	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public boolean addSala(Sala e) {
		if(salas.add(e))
			return true;
		else
			return false;
	}
	
	public boolean addSala(int num, TiposDeSalas tipo) {
		if(salas.add(new Sala(num, tipo)))
			return true;
		else
			return false;
	}
	
	public boolean addSala(int num, TiposDeSalas tipo, String descricao) {
		if(salas.add(new Sala(num, tipo)))
			return true;
		else
			return false;
	}
	
	public boolean removeSala(int index) {
		if(salas.remove(index) != null)
			return true;
		else
			return false;
	}
	
	public void showDetalhes() {
		for (int i = 0; i < salas.size(); i++) {
			System.out.println(salas.get(i).toString());
		}
	}
}