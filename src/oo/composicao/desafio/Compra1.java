package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra1 {
	
	String nome;
	List<Item1> itens = new ArrayList<Item1>();
	
	void adicionarItens(Produto p, int qtde) {
		this.itens.add(new Item1(p, qtde));
	}
	
	void adicionarItens(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item1(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		
	for (Item1 item: itens ) {
		total += item.quantidade * item.produto.preco;
	}
	
	return total;
	}
}
