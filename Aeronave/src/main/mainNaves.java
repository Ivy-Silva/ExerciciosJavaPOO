package main;

import model.NaveDois;
import model.NaveUm;

public class mainNaves {
	
	public static void main(String[] args) {
		NaveUm naveUm = new NaveUm(); //instanciar objeto
		naveUm.setCombustivel("diesel");
		naveUm.setCor("dourada");
		naveUm.setLeds(true);
		naveUm.setTamanho("grande");
		
		naveUm.ligarFarol();
		naveUm.decolar();
		naveUm.pousar();
		
		System.out.println();
		
		NaveDois naveDois = new NaveDois();
		naveDois.setCombustivel("flex");
		naveDois.setCor("prateada");
		naveDois.setnPorta(2);
		naveDois.setTamanho("grande");
		
		naveDois.decolar();
		naveDois.pousar();
		naveDois.abrirPorta();
		
	}
}
