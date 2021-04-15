package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu {

   String numeElement;
   
   
   
   
	public Element(String numeElement) {
	super();
	this.numeElement = numeElement;
}

	
	
	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMneiu) {
		throw new IllegalArgumentException ("Nu este implementata");
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		throw new IllegalArgumentException ("Nu este implementata");
	}

	@Override
	public void printeaza() {
	 System.out.println("Elementul: "+ numeElement);
		
	}
	
	

}
