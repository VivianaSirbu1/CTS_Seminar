package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.dubluri.StudentStub;
import seminar13ro.ase.cts.clase.Grupa;
import seminar13ro.ase.cts.clase.IStudent;

public class TestPromovabilitate {

	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa= new Grupa(1083);
		IStudent student= new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(), 0.01);
	}

}
