package src.Subsistemas;

import java.util.ArrayList;

import src.SistemaDeApoio.Item;

//(estoque, pedido de compra);
public class Almoxarifado {
	
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Item> pedidos = new ArrayList<Item>();
	
	public Almoxarifado(ArrayList<Item> itens, ArrayList<Item> pedidos) {
		this.itens = itens;
		this.pedidos = pedidos;
	}
	
	public Almoxarifado() {}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
	
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public boolean addItem(int tipo, Item e) {
		if(tipo == 1) {
			if(itens.add(e))
				return true;
			else 
				return false;
		}
		else {
			if(pedidos.add(e))
				return true;
			else 
				return false;
		}
	}
	
	public boolean addItem(int tipo, String nome, float preco) {
		if(tipo == 1) {
			if(itens.add(new Item(preco, nome)))
				return true;
			else 
				return false;
		}
		else {
			if(pedidos.add(new Item(preco, nome)))
				return true;
			else 
				return false;
		}
	}
	
	public boolean removeItem(int tipo, int index) {
		if(tipo == 1) {
			if(itens.remove(index) != null)
				return true;
			else 
				return false;
		}
		else {
			if(pedidos.remove(index) != null)
				return true;
			else 
				return false;
		}
	}
	
	public ArrayList<Item> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(ArrayList<Item> pedidos) {
		this.pedidos = pedidos;
	}
	
	public Item getItem(int index) {
		return itens.get(index);
	}
	
	public Item getPedido(int index) {
		return pedidos.get(index);
	}
	
	public double getGastosTotais() {
		double total = 0;
		for (int i = 0; i < itens.size(); i++) {
			total += itens.get(i).getPreco();
		}
		for (int i = 0; i < pedidos.size(); i++) {
			total += pedidos.get(i).getPreco();
		}
		return total;
	}
	
	public void showAlmoxarifado() {
		for (int i = 0; i < itens.size(); i++) {
			System.out.println(itens.get(i).toString());
		}
	}
	
	public void showPedidos() {
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println(pedidos.get(i).toString());
		}
	}
}