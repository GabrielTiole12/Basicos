package Controle;

import java.util.Scanner;

public class NumerosPrimosSwitch {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero para verificar se � primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0 ) {
				contadorDeDivisores++;
			}
			
		}
		
		switch (contadorDeDivisores) {
		case 0: 
			System.out.println("O numero " + numero + " � um numero primo");
			break;
	
			
			
	
		default:
			System.out.println("O numero " + numero + " n�o � um numero primo");
		}
		
		entrada.close();
	}
	
}
	

