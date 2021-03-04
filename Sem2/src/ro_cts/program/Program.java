package ro_cts.program;
import ro_cts.clase.readers.AngajatReader;
import ro_cts.clase.Aplicant;
import java.io.FileNotFoundException;
import java.util.List;
public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}