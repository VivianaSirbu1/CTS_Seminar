package ro.ase.cts.clase.chain;

public class ContCurent extends Cont{

	public ContCurent(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma)
		{
			super.setSold(super.getSold()-suma);
			System.out.println("Ai platit cu contul curent");
		}
		else {
			if(super.getSuccesor()==null) {
				System.out.println("Nu se poate efectua plata");

			}else {
				super.getSuccesor().plateste(suma);
			}
		}
		
	}

}
