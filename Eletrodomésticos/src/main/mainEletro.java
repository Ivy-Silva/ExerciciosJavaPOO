package main;

import model.Geladeira;
import model.Liquidificador;

public class mainEletro {
	
	public static void main(String[] args) {
		
		// instanciar objeto
		// (primeiro é classe, inicia com maiúscula)
		// (segundo é variável que recebe o objeto. Inicia com minúscula)
		
		Liquidificador liquidificador = new Liquidificador ();
		liquidificador.setConsumoEnergia(0.9);
		liquidificador.setPotencia(700);
		liquidificador.setVoltagem(110);
		liquidificador.setVelocidade(4);
		
		liquidificador.ligar();
		liquidificador.desligar();
		liquidificador.bater();
		
		System.out.println();
		
		// instanciar objeto
		Geladeira geladeira = new Geladeira ();
		geladeira.setConsumoEnergia(50.0);
		geladeira.setPotencia(160);
		geladeira.setVoltagem(220);
		geladeira.setCapacidade(90);
		
		geladeira.ligar();
		geladeira.desligar();
		geladeira.abrirPorta();
		
	}

}
