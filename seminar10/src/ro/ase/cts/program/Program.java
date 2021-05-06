package ro.ase.cts.program;

import ro.ase.cts.clase.command.ComandaConstituire;
import ro.ase.cts.clase.command.ComandaDepunere;
import ro.ase.cts.clase.command.ComandaRetragere;
import ro.ase.cts.clase.command.ContBancar;
import ro.ase.cts.clase.command.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		
		ContBancar cont = new ContBancar("Ion");
		ManagerComenzi manager= new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont,100));
		manager.invoca(new ComandaDepunere(cont,200));
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(cont,350));
		manager.executaComanda();
		manager.executaComanda();



	}

}
