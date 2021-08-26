package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SituacaoAcademia {

	public static void main(String[] args) {
		
		AlunoAcademia a1 = new AlunoAcademia("Gabriel", 80.7, true);
		AlunoAcademia a2 = new AlunoAcademia("Wildson", 124, false);
		AlunoAcademia a3 = new AlunoAcademia("Elaine", 87, false);
		AlunoAcademia a4 = new AlunoAcademia("Lucas", 76, true);
		AlunoAcademia a5 = new AlunoAcademia("Aline", 80, false);
		AlunoAcademia a6 = new AlunoAcademia("Anderson", 90, false);

		
		List<AlunoAcademia> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<AlunoAcademia> pesoIdeal = p -> p.peso <= 100;
		Predicate<AlunoAcademia> comiBem = p -> p.saudavel;
		Function<AlunoAcademia, String> emDia = p -> 
			"Parabéns " + p.nome + "! Você tem qualidade de vida!";
			
		alunos.stream()
			.filter(pesoIdeal)
			.filter(comiBem)
			.map(emDia)
			.forEach(System.out::println);
			
		
		
		
		 
		
		
		
	}
}
