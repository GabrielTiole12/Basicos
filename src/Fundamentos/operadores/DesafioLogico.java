package Fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
		// Trabalho de Terça
		// Trabalho de Quinta
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = comprouTV50 || comprouTV32;
 
		// Operador Unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50); 
		System.out.println("Comprou TV 32\"? " + comprouTV32); 
		System.out.println("Comprou TV 32\"Sorvete? " + comprouSorvete); 
		
	
		System.out.println("Mais saudavel? " + maisSaudavel);
		
		 
	}

}
