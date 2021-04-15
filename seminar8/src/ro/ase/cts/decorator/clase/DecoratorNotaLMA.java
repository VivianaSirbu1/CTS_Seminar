package ro.ase.cts.decorator.clase;

public class DecoratorNotaLMA extends DecoratorAbstract {

	public DecoratorNotaLMA(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	
	public void printeazaFelicitare() {
		System.out.println("Felicitare -La multi ani");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
}
