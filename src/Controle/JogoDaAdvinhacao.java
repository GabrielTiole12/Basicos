package Controle;

import java.util.Scanner;

public class JogoDaAdvinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeTentativas = 0;
		int numeroAleatorio = 78;
		int numero = numeroAleatorio + 0;
		
		System.out.println("Voc� j� tentou " + quantidadeDeTentativas + " vezes");
		
		do {
			System.out.println("Tente adivinhar o numero");
			
			
			System.out.print("Informe o numero: \n");
			numeroAleatorio = entrada.nextInt();
			
			if (quantidadeDeTentativas == 10) {
				System.out.println("�ltima chance");
				} else if (numeroAleatorio > numero  ) {
				System.out.println("O numero inserido � maior do que o numero armazenado");
				} else if (numeroAleatorio < numero) {
				System.out.println("O numero inserido � menor do que o numero armazenado");
			}
			
			
			 if(numeroAleatorio != numero && quantidadeDeTentativas != 11) {
				quantidadeDeTentativas++;
				System.out.println("Voc� j� tentou " + quantidadeDeTentativas + " vezes");
			} 
			
				
			
			if (quantidadeDeTentativas == 11 && numeroAleatorio != numero) {
				System.out.println("Voc� n�o tem mais alternativas");
			break;
			} 
			
		
		} while (numeroAleatorio != numero );
		
		
		if (numeroAleatorio == numero ) {
			System.out.println("Parab�ns voc� acertou !!! ");
		}
		
		entrada.close();
				
		}
			
		
	}
		

		
		
		
		
		
		


