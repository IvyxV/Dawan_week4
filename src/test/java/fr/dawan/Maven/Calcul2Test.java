package fr.dawan.Maven;

import static org.junit.Assert.*;

import static fr.dawan.Maven.Calcul2.*;


import org.junit.Test;

public class Calcul2Test {

	@Test
	public void testMultiplier() {
		assertEquals(42, Multiplier(7, 6));
	}

}
