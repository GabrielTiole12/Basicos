package Fundamentos;

import java.util.Scanner;

public class BaseAlturaDoTriangulo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base do triangulo: ");
		String b = entrada.next().replace(",", ".");
		double base = Double.parseDouble(b);
		 
		System.out.print("Informe a altura do tringulo: ");
		String h = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(h);
		
		double area = base * altura / 2;
		System.out.printf("Area = %.2f", area);
		
		entrada.close();
		
		
		
	}

}
