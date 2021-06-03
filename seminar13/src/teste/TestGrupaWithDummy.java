package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.clase.dubluri.StudentDummy;
import seminar13ro.ase.cts.clase.Grupa;
import seminar13ro.ase.cts.clase.IStudent;

public class TestGrupaWithDummy {
	
	@Test
	public void testAdaugaStudent() {
		IStudent studnet= new StudentDummy();
	    Grupa grupa = new Grupa(1083);
	    grupa.adaugaStudent(studnet);
	    assertEquals(1, grupa.getStudenti().size());
	}

}
