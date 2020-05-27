package model;

public class NaveDois extends NavePrincipal{
	
	private int nPorta;

	
	public int getnPorta() {
		return nPorta;
	}



	public void setnPorta(int nPorta) {
		this.nPorta = nPorta;
	}



	public void abrirPorta() {
		System.out.println("A porta " +this.nPorta + " foi aberta.");
	}

}
