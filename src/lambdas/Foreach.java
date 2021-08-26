package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovado = Arrays
				.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovado) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovado.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference #01...");
		aprovado.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovado.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovado.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
