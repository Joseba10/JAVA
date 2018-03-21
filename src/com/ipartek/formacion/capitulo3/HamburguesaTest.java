package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HamburguesaTest {

	
	@Test
	public void testHamburguesa() {

	}

	@Test
	public void testGetPrecio() {

		Hamburguesa viuda = new Hamburguesa();
		assertEquals(1.0f, viuda.getPrecio(), 0.01);

		boolean[] ingredientesCompleta = { true, true, true, true, true, true };
		Hamburguesa completa = new Hamburguesa();

		completa.setIngredientes(ingredientesCompleta);
		assertEquals(2.75f, completa.getPrecio(), 0.01);

}
	
	
}
