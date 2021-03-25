package ro.ase.ctc.factorymethod.clase;

public class MedicFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Medic(nume);
	}

}
