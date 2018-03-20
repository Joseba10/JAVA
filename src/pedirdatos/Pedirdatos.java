package pedirdatos;

import java.util.Scanner;

import com.ipartek.formacion.capitulo3.Mesa;

public class Pedirdatos {

	public static void main(String[] args) {
	
		
		Mesa m1= new Mesa();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("¿Numero Patas?");
		int numeroPatas=sc.nextInt();
		m1.setNumeroPatas(numeroPatas);
		 
		System.out.println("¿Dimension?");
		int dimension= sc.nextInt();
		m1.setDimension(dimension);

	
		
		System.out.println("¿Color?");
		String color= sc.next();
		m1.setColor(color);
			 
		System.out.println("¿Material?");
		int material= sc.nextInt();
		m1.setMaterial(material);
			
		System.out.println(m1.toString());
	}

}
