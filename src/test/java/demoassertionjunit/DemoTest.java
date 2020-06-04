package demoassertionjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	private static Employe e, e2;
	
	@BeforeClass
	public static void initEmployees() {
		System.out.println("@BeforeClass initEmployees");
		e = new Employe("jean", "kevin");
		e2 = new Employe("jean", "patrick");
	}
	
	@Before
	public void initialisation() {
		System.out.println("Avant la méthode de test");
	}
	
	@After
	public void liberation() {
		System.out.println("Après la méthode de test");
	}
	
	@AfterClass
	public static void deleteEmployees() {
		System.out.println("@AfterClass deleteEmployees");
		e = null;
		e2 = null;
	}
	
	@Test
	public void testTrue() {
		assertTrue("Devrait être vrai", true);
	}
	
	@Test
	public void testFalse() {
		assertFalse("Devrait être faux", false);
	}
	
	@Test
	public void testAssertArrayEqual() {
		int[] attendu = {1, 2, 3, 4, 5};
	    int[] actual = {1, 2, 3, 4, 5};
	    assertArrayEquals ("Faux les deux tableaux ne sont pas identiques", attendu, actual);
	}
	
	@Test
	public void testAssertEquals() {
		System.out.println("Vérification que les deux employees ont le même prénom");
		assertEquals("Faux les deux chaines de caractères ne sont pas identiques", e.getFirstName(), e2.getFirstName());
	}
	
	@Test
	public void testAssertNotNull() {
	    assertNotNull("Devrait être non null", new Object());
	}
	
	@Test
	public void testAssertNull() {
	    assertNull("Devrait être null", null);
	}
	
	@Test
	 public void testAssertSame() {
		Integer a = Integer.valueOf(768);
		assertSame("Devrait avoir la même valeur", a, a);
	}
	
	@Test
	 public void testAssertNotSame() {
		Integer a = Integer.valueOf(768);
		Integer b = Integer.valueOf(700);
		assertNotSame("Devrait ne pas avoir la même valeur", a, b);
	}
}
