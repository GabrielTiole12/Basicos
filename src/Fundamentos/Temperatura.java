package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(�F - 32) * 5/9 = �C
		final double ajustes = 32; 
		final double fator = 5/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajustes) * fator; 
		
		System.out.println("O resultado � " + celsius + " �C ");
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajustes) * fator; 		
		System.out.println("O resultado � " + celsius + " �C ");
	}
}
