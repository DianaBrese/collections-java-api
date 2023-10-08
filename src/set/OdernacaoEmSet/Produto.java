package set.OdernacaoEmSet;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {

	private String nome;
	private long cod;
	private double preco;
	private int quantidade;

	@Override
	public int compareTo(Produto p) {
		if (this.nome.compareToIgnoreCase(p.nome) < 0) {
			return -1;
		} else if (this.nome.compareToIgnoreCase(p.nome) > 0) {
			return 1;
		}
		return 0;
	}

	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCod() {
		return cod;
	}

	public boolean equals(Produto p) {
		if(this == p) return true;
		if(!(p instanceof Produto produto)) return false;
		return getCod() == produto.getCod();
		
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "] \n";
	}
	
	
	public static class  CompararPreco implements Comparator<Produto> {
		
		public int compare(Produto p1, Produto p2) {
		if(p1.getPreco() < p2.getPreco()) {
			return -1;
		} else if(p1.getPreco() > p2.getPreco()) {
			return 1;
		} else return 0;
		}
	}
	

}




