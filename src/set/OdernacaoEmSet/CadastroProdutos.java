package set.OdernacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> listaProduto;
	
	public CadastroProdutos() {
		this.listaProduto = new HashSet<Produto>();
	}
	
	public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
		Produto produto = new Produto(nome, cod, preco, quantidade);
		listaProduto.add(produto);
		
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> listaPorNome = new TreeSet<>(listaProduto);
		return listaPorNome;
	}
	
	public Set<Produto> exibirProdutoPorPreco() {
		Set<Produto> listaPorPreco = new TreeSet<>(new Produto.CompararPreco());
		listaPorPreco.addAll(listaProduto);
		return listaPorPreco;
		}

	public static void main(String[] args) {
		CadastroProdutos produtos = new CadastroProdutos();
		produtos.adicionarProduto("Uva", 1234, 5.99, 10);
		produtos.adicionarProduto("Abacaxi", 7689, 10.99, 200);
		produtos.adicionarProduto("Morango", 7689, 12.99, 200);
		produtos.adicionarProduto("Banana", 7689, 2.99, 200);

		System.out.println(produtos.exibirProdutosPorNome());
		//System.out.println(produtos.exibirProdutoPorPreco());


	}

}
