package ro.ase.cts.clase.readers;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends AplicantReader{
	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student=new  Student();
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			student.setFacultate(facultate);
			student.setAn_studii(an_studii);
			studenti.add(student);
		}
		input.close();
		return studenti;
	}
}
