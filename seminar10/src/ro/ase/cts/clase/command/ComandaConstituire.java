package ro.ase.cts.clase.command;

public class ComandaConstituire extends Comanda{

	public ComandaConstituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());
		
	}

}
