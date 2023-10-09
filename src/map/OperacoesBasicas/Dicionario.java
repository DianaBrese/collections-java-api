package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> definicoes;
	
	public Dicionario() {
		this.definicoes = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		this.definicoes.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		this.definicoes.remove(palavra);
	}
	
	public void pesquisarPorPalavra(String palavra) {
		String resultado = this.definicoes.get(palavra);
		System.out.println(resultado);
	}
	
	public void exibirPalavras() {
		System.out.println(definicoes);
	}
	

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		dicionario.adicionarPalavra("Palavra 1 ", " Definição 1");
		dicionario.adicionarPalavra("Palavra 2 ", " Definição 2");
		dicionario.adicionarPalavra("Palavra 3 ", " Definição 3");
		dicionario.adicionarPalavra("Palavra 4 ", " Definição 4");
		dicionario.removerPalavra("Palavra 1 ");
		dicionario.exibirPalavras();
		dicionario.pesquisarPorPalavra("Palavra 2 ");

	}
}
