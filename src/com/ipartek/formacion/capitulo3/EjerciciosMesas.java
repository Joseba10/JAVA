package com.ipartek.formacion.capitulo3;

public class EjerciciosMesas {

	public static void main(String[] args) {
		System.out.println("Listado de Mesas");
		System.out.println("---------------------");

		Mesa m1 = new Mesa();

		m1.setNumeroPatas(8);
		System.out.println(m1);

		Mesa m2 = new Mesa(1);
		System.out.println(m2);
		Mesa m3 = new Mesa(-3);
		System.out.println(m3);
	}

}
