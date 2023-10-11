package map.OrdenacaoEmMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
	private Map<String, Livro> livraria;

	public LivrariaOnline() {
		this.livraria = new HashMap<String, Livro>();
	}

	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		this.livraria.put(link, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {
		List<String> livroRemovido = new ArrayList<>();

		for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
			if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				livroRemovido.add(entry.getKey());
				break;
			}

		}

		for (String r : livroRemovido) {
			livraria.remove(r);
		}

		System.out.println(livraria);

	}

	public void pesquisarLivrosPorAutor(String autor) {
		Map<String, Livro> livroPorAutor = new HashMap<>();
		for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
			if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
				livroPorAutor.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println(livroPorAutor);
	}

	public void exibirLivrosOrdenadosPorPreco() {
		Map<String, Livro> ordenadoPreco = new TreeMap<String, Livro>(livraria);
		System.out.println(ordenadoPreco);
	}
	
	public void obterLivroMaisCaro() {
		double caro = Double.MIN_VALUE;
		String caroKey = null;
	
		for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
			if(caro < entry.getValue().getPreco()) {
				caro = entry.getValue().getPreco();
				caroKey = entry.getKey();
			}
		}
		System.out.println(livraria.get(caroKey));
		
	}
	
	public void obterLivroMaisBarato() {
		double barato = Double.MAX_VALUE;
		String baratoKey = null;
	
		for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
			if(barato > entry.getValue().getPreco()) {
				barato = entry.getValue().getPreco();
				baratoKey = entry.getKey();
			}
		}
		System.out.println(livraria.get(baratoKey));
		
	}

	public void exibirLivros() {
		System.out.println(livraria);
	}

	public static void main(String[] args) {
		LivrariaOnline livros = new LivrariaOnline();
		livros.adicionarLivro("www.amazon.com/livro1", "Título 1", "Autor 1", 20.00);
		livros.adicionarLivro("www.amazon.com/livro2", "Título 2", "Autor 2", 30.00);
		livros.adicionarLivro("www.amazon.com/livro3", "Título 3", "Autor 3", 45.00);
		livros.adicionarLivro("www.amazon.com/livro4", "Título 4", "Autor 2", 35.00);

		// livros.removerLivro("Título 2");
		//livros.exibirLivrosOrdenadosPorPreco();
		//livros.pesquisarLivrosPorAutor("Autor 2");
		livros.obterLivroMaisCaro();
		livros.obterLivroMaisBarato();
	}

}
