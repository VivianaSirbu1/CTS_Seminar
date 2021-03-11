package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public void  readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = (scanner.next()).toString();
		int varsta = Integer.valueOf(scanner.nextInt());
		int punctaj = Integer.valueOf(scanner.nextInt());
		int nr = Integer.valueOf(scanner.nextInt());
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setVarsta(varsta);
		aplicant.setPrenume(prenume);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(nr,vect);
	}
}
