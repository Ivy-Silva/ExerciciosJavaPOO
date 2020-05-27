package model;

public class EletroPrincipal {
	//atributos
	private double consumoEnergia;
	private int voltagem;
	private int potencia;
	
	// getters e setters
	public double getConsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	// métodos (ações/ verbos)
	public void ligar() {
		System.out.println("Este eletrodoméstico foi ligado.");
	}
	
	public void desligar() {
		System.out.println("Este eletrodoméstico foi desligado.");
		
	}

}
