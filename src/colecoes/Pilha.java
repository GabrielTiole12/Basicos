package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		livros.peek();
		livros.element();
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}

}
