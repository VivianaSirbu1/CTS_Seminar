package ro.ase.ctc.factorymethod.program;

import ro.ase.ctc.factorymethod.clase.AsistentFactory;
import ro.ase.ctc.factorymethod.clase.FactoryPersonal;
import ro.ase.ctc.factorymethod.clase.InfirmierFactory;
import ro.ase.ctc.factorymethod.clase.MedicFactory;
import ro.ase.ctc.factorymethod.clase.PersonalSpital;

public class Main {
	public static void printeazaPersonalSpital(FactoryPersonal factory, String nume) {
		PersonalSpital personal= factory.getPersonal(nume);
		System.out.println(personal.toString());
	}
	public static void main (String[] args) {
		printeazaPersonalSpital(new MedicFactory(),"ion");
		
		printeazaPersonalSpital(new AsistentFactory(),"Maria");
		printeazaPersonalSpital(new InfirmierFactory(),"jJJ");
	}
}
