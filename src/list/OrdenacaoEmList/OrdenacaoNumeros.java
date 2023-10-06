package list.OrdenacaoEmList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	List<Integer> listaNumeros;

	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> ascendente = new ArrayList<>(listaNumeros);
		Collections.sort(ascendente);
		System.out.println(ascendente);
		return ascendente;
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> descendente = new ArrayList(listaNumeros);
		Collections.sort(descendente);
		Collections.reverse(descendente);
		System.out.println(descendente);
		return descendente;
	}

	public void exibirLista() {
		System.out.println(listaNumeros);
	}

	public static void main(String[] args) {
		OrdenacaoNumeros lista = new OrdenacaoNumeros();
		lista.adicionarNumero(4);
		lista.adicionarNumero(1);
		lista.adicionarNumero(6);
		lista.adicionarNumero(3);
		lista.adicionarNumero(2);

		lista.exibirLista();
		lista.ordenarAscendente();
		lista.ordenarDescendente();

	}

}
