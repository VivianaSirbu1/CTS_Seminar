package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals("numele nu a fost initializat.", nume, student.getNume());
		// assertNotEquals(null,student.getNote());
		assertNotNull("lista de note nu a fost initializata.", student.getNote());
	}

	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		assertNotNull("numele nu a fost initializat.", student.getNume());
		assertNotNull("lista de note nu a fost initializata.", student.getNote());
	}

	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student = new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugareNotainLista() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());

	}
}