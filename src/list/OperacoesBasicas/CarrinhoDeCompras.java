package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		itemList.add(item);
	}

	public void removerItem(String nome) {
		List<Item> itemRemovido = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getName().equalsIgnoreCase(nome)) {
				itemRemovido.add(i);
			}
			itemList.removeAll(itemRemovido);
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (int i = 0; i < itemList.size(); i++) {
			double valorItem = itemList.get(i).getPreço() * itemList.get(i).getQuantidade();
			valorTotal += valorItem;
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras produtos = new CarrinhoDeCompras();
		
		produtos.adicionarItem("garrafa", 20.00, 5);
		produtos.adicionarItem("caderno", 5.00, 10);
		produtos.adicionarItem("caneta", 2.00, 20);
		
		produtos.exibirItens();
		
		produtos.removerItem("caderno");
		produtos.exibirItens();
		System.out.println(produtos.calcularValorTotal());
	}

}
