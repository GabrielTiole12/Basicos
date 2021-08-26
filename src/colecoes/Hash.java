package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<>();
		
		usuario.add(new Usuario("Pedro"));
		usuario.add(new Usuario("Ana"));
		usuario.add(new Usuario("Guilheme"));
		
		boolean resultado = usuario.contains(new Usuario("Guilheme"));
		System.out.println(resultado);
		
		
	}

}
