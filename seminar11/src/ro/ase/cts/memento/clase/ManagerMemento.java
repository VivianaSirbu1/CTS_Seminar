package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementos= new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento getMemento(int pos) {
		if(pos>=0 && pos<=mementos.size())
		{
			return mementos.get(pos);

		}
		 throw new  IllegalArgumentException("Pozitia nu e valida");
	}
	
	
}
