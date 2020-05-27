package model;

public class NaveUm extends NavePrincipal {
	
	private boolean leds;

	public boolean isLeds() {
		return leds;
	}

	public void setLeds(boolean leds) {
		this.leds = leds;
	}
	
	public void ligarFarol() {
		System.out.println("O farol foi ligado.");
	}

}
