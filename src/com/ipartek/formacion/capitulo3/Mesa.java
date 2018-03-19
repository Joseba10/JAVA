// 1. Definicion de package
package com.ipartek.formacion.capitulo3;
//2. Imports

//3. Definicion de Clase
public class Mesa {
	
	
	//Precio en Euros
	final int PRECIO_PATA=1;
	final int PRECIOM2=5;
	final int PRECIO_MATERIAL_MADERA=4;
	final int PRECIO_MATERIAL_ACERO=6;
	final int PRECIO_MATERIAL_ALUMINIO=5;
	final int PRECIO_MATERIAL_PLASTICO=2;
	
	final int MATERIAL_MADERA=1;
	final int MATERIAL_ACERO=1;
	final int MATERIAL_ALUMINIO=1;
	final int MATERIAL_PLASTICO=1;
	
	
	final int PRECIO_COLOR_CUSTOM=23;
	final String PRECIO_COLOR_NAME_CUSTOM="custom";
	
	
	// 4. Atributos siempre private para mantener la encapsulacion
	private int numeroPatas;
	private int M2;
	private String Color;
	private int Material;
	/*
	 * 5. Metodos
	 * 
	 * 5.1 Constructores 5.2 Getters & Setters 5.3 Otros
	 * 
	 * 
	 */

	public Mesa() {
		super();
		this.numeroPatas = 4;
	}

	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author Joseba
	 * @param numeroPatas
	 *            en caso de ser negativo se inicializa con 0
	 */

	public Mesa(int numeroPatas) {
		super();
		setNumeroPatas(numeroPatas);
	}

	



	
	//Getter y Setter
	
	public int getNumeroPatas() {
		return numeroPatas;
	}
	
	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
		// Si el numero de patas es menor que 0 pones 0 si no
		// pones el valor de la variable
	}
	
	public int getPrecio() {
		
		return 0;
	}

	public int getM2() {
		return M2;
	}

	public void setM2(int m2) {
		M2 = m2;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getMaterial() {
		return Material;
	}

	public void setMaterial(int material) {
		Material = material;
	}
	
	//To String
	public String toString() {
		return "Mesa [numeroPatas=" + numeroPatas + "]";
	}

}
