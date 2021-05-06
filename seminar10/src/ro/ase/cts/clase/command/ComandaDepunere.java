package ro.ase.cts.clase.command;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());
	}

}
