package com.ipartek.formacion.capitulo2;

import com.ipartek.formacion.capitulo3.Mesa;

public class HelloWord {
	public static void main(String[] args) {
	
		String saludo= "Hola Mundo";
		System.out.println(saludo);
		
		Mesa m1= new Mesa(Mesa.MATERIAL_ALUMINIO,2);
		System.out.println(m1.toString());
	}

}
