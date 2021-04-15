package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaAbstracta{

	private float suma;

	@Override
	public void printeaza() {
		System.out.println("Suma de plata este: "+suma);
		
	}

	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}
	
	
}
