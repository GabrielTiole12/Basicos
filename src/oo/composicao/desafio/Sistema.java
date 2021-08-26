package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		
		Compra1 compra = new Compra1();
		compra.adicionarItens("Tênis", 5.32, 2);
		compra.adicionarItens(new Produto("Borracha", 9.00), 5);
		
		Compra1 compra2 = new Compra1(); 
		compra2.adicionarItens("Lápis", 9.50, 10);
		compra2.adicionarItens(new Produto("Pasta", 7), 10);
		
		Cliente1 cliente = new Cliente1("Gabriel");
		cliente.adicionarCompra(compra);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.ObterValorTotal());
	}

}
