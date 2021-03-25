package ro.ase.ctc.factorymethod.clase;

public class Bracardier extends PersonalSpital {

	public Bracardier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [nume=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
	
	

}
