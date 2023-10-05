package list.PesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listaLivros;

	public CatalogoLivros() {
		this.listaLivros = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		listaLivros.add(livro);

	}

	public void pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getAutor().contentEquals(autor)) {
				livroPorAutor.add(listaLivros.get(i));

			}
		}
		System.out.println(livroPorAutor);
	}

	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livroPorAno = new ArrayList<>();
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getAno() >= anoInicial && listaLivros.get(i).getAno() <= anoFinal) {
				livroPorAno.add(listaLivros.get(i));
			}

		}
		System.out.println(livroPorAno);
	}

	public void pesquisarPorTitulo(String titulo) {
		List<Livro> livroPorTitulo = new ArrayList<>();
		for (int i = 0; i < listaLivros.size(); i++) {
			if (listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livroPorTitulo.add(listaLivros.get(i));
				break;
			}

		
		}
		System.out.println(livroPorTitulo);
	}

	public void mostrarLista() {
		for (Livro l : listaLivros) {
			System.out.println(l);
		}

	}

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1959);
		catalogo.adicionarLivro("A culpa é das estrela", "Jhon Green", 2016);
		catalogo.adicionarLivro("Contos de Assis", "Machado de Assis", 2000);
		catalogo.adicionarLivro("Contos de Assis", "Diana", 2000);

		// catalogo.mostrarLista();
		// catalogo.pesquisarPorAutor("Machado de Assis");
		// catalogo.pesquisarPorIntervaloAnos(2001, 2020);
		catalogo.pesquisarPorTitulo("Contos de Assis");

	}
}
