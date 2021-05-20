package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String nume;
	private List<Integer> note;

	public Student(String nume) {
		this.nume = nume;
		this.note = new ArrayList<>();
	}

	public Student() {
		this.nume = "Student";
		this.note = new ArrayList<>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Integer> getNote() {
		return note;
	}

	public void adaugaNota(int nota) {
		if(nota>1 && nota<=10)
		{
			note.add(nota);	
		}else throw new IndexOutOfBoundsException();
		
	}

	public int getNota(int index) {
		if (index >= 0 && index < note.size()) {
			return note.get(index);
		}
		throw new IndexOutOfBoundsException();
//		return 0;
	}

	public float calculeazaMedie() {
		float suma = 0;
		for (int nota : note) {
			suma += nota;
		}
		if (note.size() > 0) {
			return suma / note.size();
		} else {
			throw new IllegalArgumentException();
		}

	}

	public boolean areRestante() {
		for (int nota : note) {
			if (nota < 5) {
				return true;
			}
		}
		return false;
	}
}