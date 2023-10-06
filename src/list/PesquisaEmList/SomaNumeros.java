package list.PesquisaEmList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;

	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer n : listaNumeros) {
			soma += n;
		}
		System.out.println(soma);
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		System.out.println(Collections.max(listaNumeros));
		return Collections.max(listaNumeros);
	}
	
	public int encontrarMenorNumero() {
		System.out.println(Collections.min(listaNumeros));
		return Collections.min(listaNumeros);
	}

	public void exibirNumeros() {
		System.out.println(this.listaNumeros); }

	public static void main(String[] args) {
		SomaNumeros numeros = new SomaNumeros();
		
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(3);
		numeros.adicionarNumero(4);
		numeros.exibirNumeros();
		numeros.calcularSoma();
		numeros.encontrarMaiorNumero();
		numeros.encontrarMenorNumero();


	}
}
