package list.OperacoesBasicas;

public class Item {
	private String name;
	private double preço;
	private int quantidade;

	public Item(String name, double preço, int quantidade) {
		this.name = name;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return name + ", " + preço + ", " + quantidade;
	}
}
