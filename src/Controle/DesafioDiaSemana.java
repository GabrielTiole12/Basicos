package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome do dia: ");
		String diaDaSemana = entrada.next();
		
		if (diaDaSemana.equalsIgnoreCase("Domingo" )	) {
			System.out.println("1");
		} else if (diaDaSemana.equalsIgnoreCase("Segunda-feira")  ) {
			System.out.println("2");
		} else if (diaDaSemana.equalsIgnoreCase("Terça-feira")  	) {
			System.out.println("3");
		} else if (diaDaSemana.equalsIgnoreCase("Quarta-feira")	) {
			System.out.println("4");
		} else if (diaDaSemana.equalsIgnoreCase("Quinta-feira")	) {
			System.out.println("5");
		} else if (diaDaSemana.equalsIgnoreCase("Sexta-feira")	) {
			System.out.println("6");
		} else if (diaDaSemana.equalsIgnoreCase("Sabádo") ) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido");
		}
			
		
		entrada.close();
				
		
			
		
	}

}
