package Controle;

import java.util.Scanner;

public class DesafioPar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0  && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " está entre 0 e 10 e é par");
			} else {
				System.out.println("O numero " + numero + " está entre 0 e 10 mas não é par ");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10 ");
		}

			
		entrada.close();	
		}
		
	}
		
		
		
		
				
		
	
	
		
		
		
				
		
	
	


//if(numero < 10 && numero > 0) {
	//System.out.println("Número é entre 0 a 10 e ");
//} else if (numero > 10 && numero < 0){
	//System.out.println("Número não é entre 0 a 10 ");
//} else if (numero % 2 == 0) {
//	System.out.println(numero + " é par");
//} else {
//	System.out.println(numero + " é ímpar");
//}
	



