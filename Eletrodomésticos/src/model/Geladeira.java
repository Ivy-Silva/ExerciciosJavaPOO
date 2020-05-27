package model;

public class Geladeira extends EletroPrincipal{

	//atributos
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	//métodos
	
	public void abrirPorta() {
		System.out.println("A porta foi aberta.");
	}

}
