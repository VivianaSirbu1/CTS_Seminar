package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import seminar13ro.ase.cts.clase.Grupa;

public class TestGrupa {
	
	@Test
	public void testConstrctorCorect() {
		Grupa grupa= new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
				
	}
	
	@Test
	public void tesstConstrcutorLimitaInferioara() {
		Grupa grupa= new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	
	@Test
	public void tesstConstrcutorLimitaSuperioara() {
		Grupa grupa= new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptie() {
		Grupa grupa= new Grupa(988);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptieinAfaraLimitei() {
		Grupa grupa= new Grupa(1200);
	}
	
	@Test(timeout=500)
	public void testConstructorPersonal() {
		Grupa grupa= new Grupa(1082);
	}
	
	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa= new Grupa(1083);
		assertNotNull(grupa.getStudenti());
		
	}
}
