package Controle;

import java.util.Scanner;

public class DesafioPar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0  && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " est� entre 0 e 10 e � par");
			} else {
				System.out.println("O numero " + numero + " est� entre 0 e 10 mas n�o � par ");
			}
		} else {
			System.out.println("O numero " + numero + " n�o est� entre 0 e 10 ");
		}

			
		entrada.close();	
		}
		
	}
		
		
		
		
				
		
	
	
		
		
		
				
		
	
	


//if(numero < 10 && numero > 0) {
	//System.out.println("N�mero � entre 0 a 10 e ");
//} else if (numero > 10 && numero < 0){
	//System.out.println("N�mero n�o � entre 0 a 10 ");
//} else if (numero % 2 == 0) {
//	System.out.println(numero + " � par");
//} else {
//	System.out.println(numero + " � �mpar");
//}
	



