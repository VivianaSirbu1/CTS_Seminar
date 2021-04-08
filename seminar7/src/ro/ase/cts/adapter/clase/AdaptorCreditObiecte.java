package ro.ase.cts.adapter.clase;

public class AdaptorCreditObiecte implements CreditAbstract{

	private Leasing leasing;
	
	public AdaptorCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	
	@Override
	public void oferaCredit(float suma) {
		leasing.imprumta();
		
	}
	
	

}
