package Controle;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano atual: ");
		int ano = entrada.nextInt();
		
			if (ano % 4 == 0) {
				System.out.println("O ano de " + ano + " � bissexto");
			} else {
				System.out.println("O ano de " + ano + " n�o � bissexto");
			}
			
			entrada.close();	
			
	}	

}

		
	


