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
		System.out.println("---------------------");
		Mesa izaskun = new Mesa();
		izaskun.setNumeroPatas(8);
		izaskun.setDimension(6);
		izaskun.setColor("negro");
		izaskun.setMaterial(1);

		Mesa mikel = new Mesa();
		mikel.setNumeroPatas(2);
		mikel.setDimension(5);
		mikel.setColor("verde");
		mikel.setMaterial(1);
	
		
		Mesa aingeru = new Mesa();
		aingeru.setNumeroPatas(5);
		aingeru.setDimension(7);
		aingeru.setColor("plateado");
		aingeru.setMaterial(2);
	
		
		
		Mesa joseba = new Mesa();
		joseba.setNumeroPatas(3);
		joseba.setDimension(5);
		joseba.setColor("amarillo");
		joseba.setMaterial(3);

		
		Mesa ander = new Mesa();
		ander.setNumeroPatas(1);
		ander.setDimension(2);
		ander.setColor("custom");
		ander.setMaterial(4);
		
		System.out.println(izaskun.toString());
		System.out.println(mikel.toString());
		System.out.println(joseba.toString());
		System.out.println(aingeru.toString());
		System.out.println(ander.toString());

	}

}
