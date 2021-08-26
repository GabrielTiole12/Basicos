package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu salario: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o seu salario: ");
		String valor2 = entrada.nextLine().replace(",", ".");;
		
		System.out.print("Informe o seu salario: ");
		String valor3 = entrada.nextLine().replace(",", ".");;
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1 + salario2 + salario3);
		
		System.out.println("A média do salario é " + soma / 3);
		
		entrada.close();
		
		
		
		
	}

}
