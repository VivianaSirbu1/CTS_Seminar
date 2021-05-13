package ro.ase.cts.memento.clase;

public class Main {

	public static void main(String[] args) {
		MeciJucat meciJucat= new MeciJucat("echipa1","echipa2",3, 2,7,8);
		ManagerMemento manager= new ManagerMemento();
		manager.adaugaMemento(meciJucat.creareMemento());
		
		
		meciJucat.setNumeGazda("Echipa3");
		meciJucat.setNumeOaspeti("ANANAN");
		meciJucat.setNrSpectatori(23);
		meciJucat.setNrBilete(22);
		
		manager.adaugaMemento(meciJucat.creareMemento());
		
		System.out.println(meciJucat.toString());
		
		meciJucat.setMemento(manager.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}
