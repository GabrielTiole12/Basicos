package Controle;

import java.util.Scanner;

public class SituacaoDoAluno {
	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Nota parcial 1:  ");
		 double nota1 = entrada.nextDouble();
		 
		 System.out.println("Nota parcial 2: ");
		 double nota2 = entrada.nextDouble();
		 
		 double media = (nota1 + nota2) / 2;
		 
		 if (media > 10 || media < 0) {
			System.out.println("Nota inv�lida");
		} else if (media >= 7.0) {
			System.out.println(" Sua media foi " + media + " e voc� est� aprovado");
		} else if (media >= 4.0) {
			System.out.println(" Sua media foi " + media + " e voc� est� de recupera��o");
		} else {
			System.out.println(" Sua media foi " + media + " e voc� est� reprovado");
		}
				 
		 	entrada.close();
	}
			
}
	


