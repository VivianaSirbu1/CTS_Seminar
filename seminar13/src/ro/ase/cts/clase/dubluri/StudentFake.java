package ro.ase.cts.clase.dubluri;

import java.util.List;

import seminar13ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {
	String nume;
	float medie;
	int nota;
	boolean valoareAreRestante;

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub

	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return nota;
	}
	
	

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	
	
}
