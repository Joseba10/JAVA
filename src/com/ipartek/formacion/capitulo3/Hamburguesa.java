package com.ipartek.formacion.capitulo3;

import java.lang.reflect.Array;

public class Hamburguesa {
	public static final String[] LISTA_INGREDIENTES = { "pan", "carne", "tomate", "lechuga", "pepino", "queso" };
	public static final float[] LISTA_INGREDIENTES_PRECIO = { 0.30f, 0.70f, .50f, .25f, .30f, .70f };

	// atributo
	private boolean[] ingredientes;

	public Hamburguesa() {
		super();
		this.ingredientes = new boolean[LISTA_INGREDIENTES.length];
		this.ingredientes[0] = true; // pan
		this.ingredientes[1] = true; // carne
	}

	public boolean[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(boolean[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public float getPrecio() {
		float resul = 0;

		for (int i = 0; i < this.ingredientes.length; i++) {

			if (ingredientes[i]) {
				resul += LISTA_INGREDIENTES_PRECIO[i];
			}

		}

		return resul;
}
	}
