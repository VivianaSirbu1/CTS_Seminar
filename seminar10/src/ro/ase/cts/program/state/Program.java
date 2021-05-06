package ro.ase.cts.program.state;

import ro.ase.cts.clase.state.Masa;
import ro.ase.cts.clase.state.MasaLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(3);
		
		masa.elibereazaMasa();
//		masa.setStareMasa(new MasaLibera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		

	}

}
