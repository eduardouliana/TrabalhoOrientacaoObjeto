package br.edu.eduardo.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> itens;

	public void adicionarProduto(Produto produto) {
		if (itens == null) {
			itens = new ArrayList<>();
		}
		itens.add(produto);
	}

	public void removerProduto(Produto produto) {
		if (itens != null) {
			itens.remove(produto);
		}
	}

	public List<Produto> getProdutos() {
		return itens;
	}

	public Double valorTotal() {
		return itens.stream().mapToDouble(Produto::getValor).sum();
	}

	public void ordenarCrescente() {
		if (itens != null) {
			itens.sort((b, a) -> b.getValor().compareTo(a.getValor()));
		}	
	}

	public void ordenarDecrescente() {
		if (itens != null) {
			itens.sort((b, a) -> a.getValor().compareTo(b.getValor()));
		}
	}
}
