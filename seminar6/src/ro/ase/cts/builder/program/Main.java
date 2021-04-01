package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).built();
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(35).setAreMuzicaAmbientala(true)
				.setGenMuzica("Pop").built();
		Rezervare rezervare3 = new Rezervare(false, true, true, false, null, 70);
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
       
	}

}
