package Fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
	
	// Parte 1 
	double num1 = 6 * (3 + 2);
	double numA = Math.pow(num1, 2);
	double denA = 3 * 2;
	double total1 = numA / denA; 
	
	
	// Parte 2
	double e = ((1 - 5) * (2 - 7)) / 2;
	double total2 = Math.pow(e, 2);
	double valor = total1 - total2; 
	double total3 = Math.pow(valor, 3);
	
	
	// Parte Final
	double inferior = Math.pow(10, 3);
	double total = total3 / inferior ;
	
	
	System.out.println("O resultado da resolução é " + total);
	
	}

}


