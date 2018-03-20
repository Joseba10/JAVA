package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

public class Asistente {

	static int patas;
	static String color;
	
	
	public static void main(String[] args) {
		System.out.println("Configurador de Mesas");
		System.out.println(("----------------------"));
		pedirdatos();
		imprimirticket();
	}

	private static void pedirdatos() {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("¿Numero Patas?");
		 patas=sc.nextInt();

			System.out.println("¿Color?");
			 color= sc.next();
			 
			 System.out.println("¿Material?");
			 color= sc.next();
		
		
	}

	private static void imprimirticket() {

		System.out.println(("----------------------"));
		System.out.println(("---------RESUMEN------------"));
		System.out.println(("----------------------"));
		System.out.println("Color "+ color);
		System.out.println("Numero de Patas "+ patas);
		System.out.println("Precio 12 €");
		
	}

}
