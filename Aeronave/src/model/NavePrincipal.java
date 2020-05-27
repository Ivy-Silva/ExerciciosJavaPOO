package model;

public class NavePrincipal {
	private String combustivel;
	private String tamanho;
	private String cor;
	
	
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void decolar() {
		System.out.println("A nave decolou!");
	}
	
	public void pousar() {
		System.out.println("A nave pousou!");
		
	}
	

}
