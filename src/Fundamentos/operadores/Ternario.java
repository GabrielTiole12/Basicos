package Fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.0;
		//String resultadoParcial = media >= 5.0 ? "em recupera��o. " : "reprovado. ";
		String resultadoFinal = media  >= 7.0 ? 
				"aprovado. " : "reprovado. ";
		
		System.out.println("O aluno est� " + resultadoFinal); 
		
		
		
		double nota = 9.9;
		boolean bomComportamento = true; 
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto  = bomComportamento  && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s",  resultado);
		
		
	
	
		//String resultadoParcial = media >= 5.0 ? "em recupera��o. " : "reprovado. ";
	
	}

}
