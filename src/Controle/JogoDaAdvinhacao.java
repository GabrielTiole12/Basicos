package Controle;

import java.util.Scanner;

public class JogoDaAdvinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeTentativas = 0;
		int numeroAleatorio = 78;
		int numero = numeroAleatorio + 0;
		
		System.out.println("Você já tentou " + quantidadeDeTentativas + " vezes");
		
		do {
			System.out.println("Tente adivinhar o numero");
			
			
			System.out.print("Informe o numero: \n");
			numeroAleatorio = entrada.nextInt();
			
			if (quantidadeDeTentativas == 10) {
				System.out.println("Última chance");
				} else if (numeroAleatorio > numero  ) {
				System.out.println("O numero inserido é maior do que o numero armazenado");
				} else if (numeroAleatorio < numero) {
				System.out.println("O numero inserido é menor do que o numero armazenado");
			}
			
			
			 if(numeroAleatorio != numero && quantidadeDeTentativas != 11) {
				quantidadeDeTentativas++;
				System.out.println("Você já tentou " + quantidadeDeTentativas + " vezes");
			} 
			
				
			
			if (quantidadeDeTentativas == 11 && numeroAleatorio != numero) {
				System.out.println("Você não tem mais alternativas");
			break;
			} 
			
		
		} while (numeroAleatorio != numero );
		
		
		if (numeroAleatorio == numero ) {
			System.out.println("Parabéns você acertou !!! ");
		}
		
		entrada.close();
				
		}
			
		
	}
		

		
		
		
		
		
		


