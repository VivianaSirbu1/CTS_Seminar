package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdaptorCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}
	
	
	public static void main(String[] args) {
		Leasing leasing= new Leasing(100, "Ion");
		AdaptorCreditObiecte adaptor= new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor, leasing.getSuma());
	}

}
