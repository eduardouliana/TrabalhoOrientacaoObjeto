package br.edu.eduardo.carrinhocompras;

public class Vestuario extends Produto {

	@Override
	public Double calcularValor(Double valor, Double quantidade) {
		return ((valor * 0.75) * quantidade);
	}

//	@Override
	//public Double calcularValor() {
//		return ((this.getValor() * 0.75) * this.getQuantidade());
//	}
}
