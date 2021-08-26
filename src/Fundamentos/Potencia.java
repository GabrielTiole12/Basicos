package Fundamentos;

import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		String num = entrada.next();
		double num1 = Double.parseDouble(num);
		
		double aoQuadrado = (int)Math.pow(num1, 2);
		double aoCubo = (int) Math.pow(num1, 3);
		
		System.out.printf("Ao Quadrado = %.2f ", aoQuadrado);
		
		System.out.printf("Ao Cubo = %.2f ", aoCubo);
		
		entrada.close();
	}

}
