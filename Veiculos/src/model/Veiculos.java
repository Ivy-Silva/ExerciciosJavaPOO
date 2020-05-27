package model;

public class Veiculos {
	
	// atributos
	private String combustivel;
	private String marca;
	private String modelo;
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// métodos
	public void acelerar() {
		System.out.println("O veículo está acelerando.");
	}
	
	public void frear() {
		System.out.println("Você freou. O veículo está desacelerando.");
	}

}
