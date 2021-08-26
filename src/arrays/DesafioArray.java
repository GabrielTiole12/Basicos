package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		
		// Quantidade
		System.out.print("Quantas notas deseja calcular: ");
		int quantidadeDeNotas1 = entrada.nextInt();
		double[] quantidadeDeNotas = new double [quantidadeDeNotas1];
		
		
		// Notas
		for (int i = 0; i < quantidadeDeNotas.length; i++) {
			System.out.print("Digite sua nota: ");
			double notas = entrada.nextDouble();
			
		if (notas >=  0 && notas <= 10) {
			total += notas;
			continue;
		}
		 
		else {
				System.out.println("Nota inválida ");
		}
		
		}	
		
		double media = total / quantidadeDeNotas1;
		System.out.println("Média = " + media);
		
		entrada.close();
		}
	
}
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
