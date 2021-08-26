package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente1 {
	
	String nome;
	List<Compra1> compras = new ArrayList<>();
	
	Cliente1(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra1 compra) {
		this.compras.add(compra);
	}
	
	double ObterValorTotal() {
		double total = 0;
		
		for(Compra1 compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
		}
}