package ro.ase.ctc.factorymethod.clase;

public class AsistentFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Asistent(nume);
	}

}
