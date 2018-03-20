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
	
	public static final int MATERIAL_MADERA=1;
	public static final int MATERIAL_ACERO=2;
	public static final int MATERIAL_ALUMINIO=3;
	public static final int MATERIAL_PLASTICO=4;
	
	
	final int PRECIO_COLOR_CUSTOM=23;
	final String PRECIO_COLOR_NAME_CUSTOM="custom";
	
	
	// 4. Atributos siempre private para mantener la encapsulacion
	private int numeroPatas;
	private int dimension;
	private String color;
	private int material;
	

	
	

	public Mesa() {
		//Constructor por defecto siempre llama a super
		super();
		//Inicializar elementos
		this.numeroPatas = 4;
		this.dimension=1;
		this.color="blanco";
		this.material=MATERIAL_MADERA;
	}

	//Si pones mas constructores lo que hacen es sobrecargar por lo que añade esos elementos
	public Mesa(int material) {
		
		this(); //llamar siempre al constructor por defecto
		this.material=material;
		
		
	}
	
	public Mesa(int material,int dimension) {
		this(material);
		this.dimension=dimension;
	}

	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author Joseba
	 * @param numeroPatas
	 *            en caso de ser negativo se inicializa con 0
	 */



	/*
	 * 5. Metodos
	 * 
	 * 5.1 Constructores 5.2 Getters & Setters 5.3 Otros
	 * 
	 * 
	 */

	//Getter y Setter
	
	public int getNumeroPatas() {
		return numeroPatas;
	}
	
	public void setNumeroPatas(int numeroPatas) {

		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
		// Si el numero de patas es menor que 0 pones 0 si no
		// pones el valor de la variable
	}
	
	
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Mesa [numeroPatas= " + numeroPatas + ", dimension= " + dimension + ", color= " + color + ", material= "
				+ material +" precio "+ getPrecio()+"]";
	}

	
	
	/**
	 * Calcular el precio de la mesa en funcion de los materiales usados.
	 * 
	 * @see Consulta todas las constates definidas para los precios
	 * @return int precio en euros
	 */
	public int getPrecio() {
		int resul = 0;
		
	
		 resul= (numeroPatas*PRECIO_PATA)+(dimension*PRECIOM2);
			if (color==PRECIO_COLOR_NAME_CUSTOM) {
				
				resul=resul+PRECIO_COLOR_CUSTOM;
			}
			else {
				
				resul= resul +0;
				
			}
		 switch (material) {
		case 1:
			
				resul= resul+PRECIO_MATERIAL_MADERA;
			
			break;
		case 2:
			
				resul= resul+PRECIO_MATERIAL_ACERO;
			
			break;
		case 3:
	
				resul= resul+PRECIO_MATERIAL_ALUMINIO;
	
				break;
		case 4:
	
				resul= resul+PRECIO_MATERIAL_PLASTICO;
	
				break;

		default:
				break;
		}
		return resul;
		
		
	}




}
