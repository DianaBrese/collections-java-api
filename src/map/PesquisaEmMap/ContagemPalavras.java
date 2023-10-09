package map.PesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	Map<String, Integer> contador;
	
	public ContagemPalavras() {
		this.contador = new HashMap<String, Integer>();
	}
	
	public void exibirContagemPalavras() {
		System.out.println(this.contador);
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		this.contador.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		this.contador.remove(palavra);
	}
	
	public void palavraMaisFrequente() {
		String palavra = null;
		int frequencia = 0;
		for(Map.Entry<String, Integer>  entry : contador.entrySet()) {
			if(entry.getValue() > frequencia) {
				frequencia = entry.getValue();
				palavra = entry.getKey();
			}
			
		}
		System.out.println("A palavra mais frequente é " + palavra + " com " + frequencia + " repetições");
	}

	public static void main(String[] args) {
		ContagemPalavras palavras = new ContagemPalavras();
		palavras.adicionarPalavra("Palavra 1!", 15);
		palavras.adicionarPalavra("Palavra 2!", 20);
		palavras.adicionarPalavra("Palavra 3!", 33);
		palavras.adicionarPalavra("Palavra 4!", 60);
		palavras.exibirContagemPalavras();
		palavras.palavraMaisFrequente();
	}

}
