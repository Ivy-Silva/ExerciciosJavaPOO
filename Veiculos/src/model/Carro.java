package model;

public class Carro extends Veiculos {
	
	private int qtdPortas;

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	public void abrirPorta() {
		System.out.println("Este carro tem " +qtdPortas + " portas.");
	}

}
