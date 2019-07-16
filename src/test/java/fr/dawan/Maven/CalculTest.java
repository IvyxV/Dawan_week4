package fr.dawan.Maven;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

import static fr.dawan.Maven.Calcul.*;

public class CalculTest extends TestCase {

	@Test
	public void testSomme() {
		assertEquals(9, somme(5, 4));
	}

}
