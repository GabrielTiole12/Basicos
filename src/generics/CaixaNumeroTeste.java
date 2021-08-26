package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		Caixa <Double> caixaA = new Caixa<>();
		caixaA.guarda(2.3);
		System.out.println(caixaA.abrir());
		
		Caixa <Integer> caixaB = new Caixa<>();
		caixaB.guarda(123);
		System.out.println(caixaB.abrir());
		
		
	}
}
