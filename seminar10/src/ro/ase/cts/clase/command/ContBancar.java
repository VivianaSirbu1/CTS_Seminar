package ro.ase.cts.clase.command;

public class ContBancar {
	
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		sold= suma;
		System.out.println("S-a constituit contul cu suma: "+suma);
	}
	
	public void retragrere(float suma) {
		if(suma<=sold)
		{
			sold-=suma;
			System.out.println("S-a retras suma: "+suma);
			
		}
		else
		{
			System.out.println("Fonduri insuficiente");

		}
	}
	
	public void depunere(float suma) {
		sold+=suma;
		System.out.println("S-a depus suma "+suma);

	}
	

}
