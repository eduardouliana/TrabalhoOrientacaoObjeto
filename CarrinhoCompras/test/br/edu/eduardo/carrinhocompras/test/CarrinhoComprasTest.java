package br.edu.eduardo.carrinhocompras.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.eduardo.carrinhocompras.Bebida;
import br.edu.eduardo.carrinhocompras.Carrinho;
import br.edu.eduardo.carrinhocompras.Produto;
import br.edu.eduardo.carrinhocompras.Vestuario;

public class CarrinhoComprasTest {

	@Test
	public void deveAdicionarCervejaComDesconto5PorCento() {
		Bebida cerveja = new Bebida();
		cerveja.setDescricao("Cerveja");
		cerveja.setQuantidade(10.0);
		cerveja.setValor(5.50);

		assertEquals(Double.valueOf(52.25), cerveja.getValor());
	}

	@Test
	public void deveAdicionarCamisaComDesconto25PorCento() {
		Vestuario camisa = new Vestuario();
		camisa.setDescricao("Camisa");
		camisa.setQuantidade(5.0);
		camisa.setValor(45.0);

		assertEquals(Double.valueOf(168.75), camisa.getValor());
	}

	@Test
	public void deveAdicionarUmaBebidaNoCarinho() {
		Bebida bebida = new Bebida();
		bebida.setDescricao("Guaraná");
		bebida.setQuantidade(15.0);
		bebida.setValor(5.0);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(bebida);

		assertEquals(Double.valueOf(71.25), bebida.getValor());
		assertEquals(bebida, carrinho.getProdutos().get(0));
	}

	@Test
	public void deveAdicionarUmVestuarioNoCarinho() {
		Vestuario vestuario = new Vestuario();
		vestuario.setDescricao("Casaco");
		vestuario.setQuantidade(2.0);
		vestuario.setValor(80.0);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(vestuario);

		assertEquals(Double.valueOf(120.0), vestuario.getValor());
		assertEquals(vestuario, carrinho.getProdutos().get(0));				
	}

	@Test
	public void deveAdicionar2ProdutosNoCarinho() {
		Vestuario roupa = new Vestuario();
		roupa.setDescricao("Calça");
		roupa.setQuantidade(5.0);
		roupa.setValor(100.0);

		Bebida refrigerante = new Bebida();
		refrigerante.setDescricao("Guaraná");
		refrigerante.setQuantidade(20.0);
		refrigerante.setValor(5.0);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(roupa);
		carrinho.adicionarProduto(refrigerante);
		carrinho.valorTotal();

		assertEquals(Double.valueOf(375.0), roupa.getValor());
		assertEquals(Double.valueOf(95.0), refrigerante.getValor());
		
		assertEquals(roupa, carrinho.getProdutos().get(0));
		assertEquals(refrigerante, carrinho.getProdutos().get(1));
		
		assertEquals(Double.valueOf(470.0), carrinho.valorTotal());	
	}
	
	@Test
	public void deveAdicionar2ProdutosNoCarinhoOrdenar() {
		Vestuario roupa = new Vestuario();
		roupa.setDescricao("Calça");
		roupa.setQuantidade(5.0);
		roupa.setValor(100.0);

		Bebida refrigerante = new Bebida();
		refrigerante.setDescricao("Guaraná");
		refrigerante.setQuantidade(20.0);
		refrigerante.setValor(5.0);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(roupa);
		carrinho.adicionarProduto(refrigerante);
		carrinho.valorTotal();

		carrinho.ordenarCrescente();
		assertEquals(refrigerante, carrinho.getProdutos().get(0));
		
		carrinho.ordenarDecrescente();
		assertEquals(roupa, carrinho.getProdutos().get(0));		
	}
}
