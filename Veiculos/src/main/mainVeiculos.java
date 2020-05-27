package main;

import model.Carro;
import model.Moto;

public class mainVeiculos {
	
public static void main(String[] args) {
		
		//instanciar
		Carro carro = new Carro();
		carro.setCombustivel("flex");
		carro.setMarca("Nissan");
		carro.setModelo("March");
		carro.setQtdPortas(4);
		
		carro.acelerar();
		carro.frear();
		carro.abrirPorta();
		
		System.out.println();
		
		Moto moto = new Moto();
		moto.setCombustivel("gasolina");
		moto.setMarca("Honda");
		moto.setModelo("CB");
		moto.setCilindradas(450);
		
		
		
		
	}

}
