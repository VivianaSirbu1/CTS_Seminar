package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.MenegerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		MenegerSala managerSala = new MenegerSala("Sala nr 3");
		Observer client1= new Client("Alin");
		Observer client2= new Client("Ion");
		Observer client3= new Client("Ana");
		
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.trimiteAnuntImportant("Volei");
		managerSala.stergereAbonat(client3);
		managerSala.trimiteAnuntImportant("Handbal");

	}

}
