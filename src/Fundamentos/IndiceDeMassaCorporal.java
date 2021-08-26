package Fundamentos;

import java.util.Scanner;

public class IndiceDeMassaCorporal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		String pes = entrada.next().replace(",", ".");
		double peso = Double.parseDouble(pes);
		
		System.out.print("Informe sua altura: ");
		String alt = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(alt);
		
		double altura2 = Math.pow(altura, 2);
		double IMC = peso / altura2;
		
		
		System.out.printf("IMC = %.2f ", IMC );
		entrada.close();
		
		
		

		
		
		
	}

}
