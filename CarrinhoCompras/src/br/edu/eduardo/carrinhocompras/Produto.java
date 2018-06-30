package br.edu.eduardo.carrinhocompras;

public abstract class Produto {
	private String descricao;
	private Double quantidade;
	private Double valor;
	
	public abstract Double calcularValor(Double valor, Double quantidade);

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = calcularValor(valor,this.quantidade);
	}

}
