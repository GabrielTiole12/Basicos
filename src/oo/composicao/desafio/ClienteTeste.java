package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItens("Caneta", 9.67, 100);
		compra1.adicionarItens(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItens("Caderno", 10, 10);
		compra2.adicionarItens(new Produto("Impressora", 998.90), 1);
		
		Cliente cliente = new Cliente("Gabriel");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.ObterValorTotal());
	}

}
