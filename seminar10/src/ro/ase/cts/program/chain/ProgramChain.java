package ro.ase.cts.program.chain;

import ro.ase.cts.clase.chain.ContCredit;
import ro.ase.cts.clase.chain.ContCurent;
import ro.ase.cts.clase.chain.ContEconomii;

public class ProgramChain {
	
     public static void main(String[] args) {
		ContEconomii contEconomii = new ContEconomii(100);
		ContCurent contCurent = new ContCurent(400);
		ContCredit contCredit = new ContCredit(300);

		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCurent.plateste(50);
		contCurent.plateste(340);
		contCurent.plateste(50);
		contCurent.plateste(200);
		contCurent.plateste(150);

	}

}
