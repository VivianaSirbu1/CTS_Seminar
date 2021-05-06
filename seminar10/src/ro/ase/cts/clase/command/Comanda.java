package ro.ase.cts.clase.command;

public abstract class Comanda {

	private ContBancar cont;
	private float suma;
	
	public Comanda(ContBancar cont, float suma) {
		super();
		this.cont = cont;
		this.suma = suma;
	}

	public ContBancar getCont() {
		return cont;
	}

	public float getSuma() {
		return suma;
	}
	
	public abstract void executa();
	
}
