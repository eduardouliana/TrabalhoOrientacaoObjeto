package br.edu.eduardo.carrinhocompras;

public class Bebida extends Produto {

	@Override
	public Double calcularValor(Double valor, Double quantidade) {
		//return ((this.getValor() * 0.95) * this.getQuantidade());
		return ((valor * 0.95) * quantidade);
	}

}
