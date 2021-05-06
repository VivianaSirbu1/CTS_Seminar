package ro.ase.cts.clase.command;

public class ComandaRetragere extends Comanda{

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().retragrere(super.getSuma());
		
	}

	
}
