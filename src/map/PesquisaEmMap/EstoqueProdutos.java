package map.PesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	Map<Long, Produto> estoque;

	public EstoqueProdutos() {
		this.estoque = new HashMap<Long, Produto>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		Produto produto = new Produto(nome, quantidade, preco);
		this.estoque.put(cod, produto);
	}

	public void exibirProdutos() {
		System.out.println(estoque);
	}

	public double calcularValorTotalEstoque() {
		double precoTotal = 0;
		for (Produto p : estoque.values()) {
			precoTotal += p.getQuantidade() * p.getPreco();
		}
		return precoTotal;
	}

	public void obterProdutoMaisCaro() {
		double maiorPreco = Double.MIN_VALUE;
		Produto produtoMaisCaro = null;

		for (Produto p : estoque.values()) {
			if (p.getPreco() > maiorPreco) {
				maiorPreco = p.getPreco();
				produtoMaisCaro = p;
			}
		}
		System.out.println(produtoMaisCaro);
	}
	
	public void obterProdutoMaisBarato() {
		double menorPreco = Double.MAX_VALUE;
		Produto produtoMaisBarato = null;

		for (Produto p : estoque.values()) {
			if ( menorPreco > p.getPreco()) {
				menorPreco = p.getPreco();
				produtoMaisBarato = p;
			}
		}
		System.out.println(produtoMaisBarato);
	}
	
	public void maiorEstoque() {
		int totalEstoque = 0;
		Produto maiorQuantidade = null;
		
		for(Produto p : estoque.values() ) {
			if(p.getQuantidade() > totalEstoque) {
				totalEstoque = p.getQuantidade();
				maiorQuantidade = p;
			}
		}
		System.out.println(maiorQuantidade);
	}

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.adicionarProduto(2145, "banana", 10, 2.99);
		estoque.adicionarProduto(5698, "uva", 30, 5.99);
		estoque.adicionarProduto(9874, "melancia", 20, 3.99);
		estoque.adicionarProduto(3547, "maça", 50, 6.99);
		estoque.exibirProdutos();
		estoque.obterProdutoMaisCaro();
		estoque.obterProdutoMaisBarato();
		estoque.maiorEstoque();

	}

}
