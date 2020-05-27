package model;

public class Liquidificador extends EletroPrincipal{
	// atributos
	private int velocidade;
	
	// getters e setters
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// métodos (verbos, ações)
	 public void bater() {
		 System.out.println("O liquidificador está batendo.");
	 }
	
}
