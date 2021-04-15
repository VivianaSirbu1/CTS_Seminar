package ro.ase.cts.decorator.clase;

public class DecoratorNotaPasteFericit extends DecoratorAbstract {

	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	
	public void printeazaFelicitare() {
		System.out.println("Felicitare -Paste fericit");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("Paste fericit!");
	}
}
