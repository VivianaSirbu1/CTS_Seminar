package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adaoterclase.clase.AdaptorCreditClase;
import ro.ase.cts.adaoterclase.clase.CreditAbstract;

public class Main {

	
	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}
	 
	public static void main(String[] args) {
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50, "Vasile");
		afiseazaInfoCredit(adaptorClase);

	}

}
