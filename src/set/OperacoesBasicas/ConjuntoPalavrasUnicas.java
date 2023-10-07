package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicas = new HashSet<String>();
	}
	
	public void adicionarPalavra(String palavra) {
		this.palavrasUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		Set<String> palavraRemovida = new HashSet<String>();
		for(String p : palavrasUnicas) {
			if(p.equalsIgnoreCase(palavra)) {
				palavraRemovida.add(palavra);
				break;
			}
		}
		
		palavrasUnicas.removeAll(palavraRemovida);
	}
	
	public void verificarPalavra(String palavra) {
	 boolean status =  palavrasUnicas.contains(palavra);
		if(status) {
			System.out.println("Palavra existe no conjunto");
		} else {
			System.out.println("Palavra não existe no conjunto");
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(this.palavrasUnicas);
	}
	
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
		palavras.adicionarPalavra("Maça");
		palavras.adicionarPalavra("Laranja");
		palavras.adicionarPalavra("Uva");
		palavras.adicionarPalavra("Pera");
		palavras.exibirPalavrasUnicas();
		palavras.removerPalavra("Pera");
		palavras.exibirPalavrasUnicas();
		palavras.verificarPalavra("Uva");


	}
}
