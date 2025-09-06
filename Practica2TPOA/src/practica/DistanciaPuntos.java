package practica;

import java.util.Scanner;

public class DistanciaPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double[] punto_a = new double[3];
		double[] punto_b = new double[3];
		double[] punto_c = new double[3];
		
		System.out.println("Ingrese las coordenadas del punto A:");
		
		for(int x = 1; x < punto_a.length; x++) {
			System.out.println("valor"+ x + ":");
			double valor1 = scanner.nextDouble();
			punto_a[x] = valor1;
			
		}
		
		System.out.println("Ingrese las coordenadas del punto B:");
		
		for(int x = 1; x < punto_b.length; x++) {
			System.out.println("valor"+ x + ":");
			double valor1 = scanner.nextDouble();
			punto_b[x] = valor1;
			
		}
		
		System.out.println("Ingrese las coordenadas del punto C:");
		
		for(int x = 1; x < punto_c.length; x++) {
			System.out.println("valor"+ x + ":");
			double valor1 = scanner.nextDouble();
			punto_c[x] = valor1;
			
		}
		
		scanner.close();
		

		double cuadrada_abx = Math.pow(punto_b[1] - punto_a[1], 2);
	
		
		double cuadrada_aby = Math.pow(punto_b[2] - punto_a[2], 2);
	
		
		double suma_ab = cuadrada_abx + cuadrada_aby;
		
		double recta1 = Math.sqrt(suma_ab);

		
		
		double cuadrada_bcx = Math.pow(punto_c[1] - punto_b[1], 2);
	
		
		double cuadrada_bcy = Math.pow(punto_c[2] - punto_b[2], 2);
	
		
		double suma_bc = cuadrada_bcx + cuadrada_bcy;
		
		double recta2 = Math.sqrt(suma_bc);
		
		
		
		double cuadrada_acx = Math.pow(punto_c[1] - punto_a[1], 2);
	
		
		double cuadrada_acy = Math.pow(punto_c[2] - punto_a[2], 2);
	
		
		double suma_ac = cuadrada_acx + cuadrada_acy;
		
		double recta3 = Math.sqrt(suma_ac);
		
		
		
		System.out.println("Lado AB: " + recta1);
		
		System.out.println("Lado BC: " + recta2);
		
		System.out.println("Lado AC: " + recta3);
		
		
		if(recta1 == recta2 || recta2 == recta3 || recta1 == recta3) {
			System.out.println("Es un triangulo: isosceles");
		}
		if(recta1 != recta2 && recta2 != recta3 && recta1 != recta3){
			System.out.println("Es un triangulo: escaleno");
		}
		if(recta1 == recta2 && recta2 == recta3 && recta1 == recta3) {
			System.out.println("Es un triangulo: equilatero");
		}
			
		
		double perimetro = recta1 + recta2 + recta3;
		
		System.out.println("El perimetro es: " + perimetro); 
		
		
		
		
		
		
		
		
	}

}
