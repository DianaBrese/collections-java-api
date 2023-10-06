package list.OrdenacaoEmList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		listaPessoas.add(pessoa);
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		System.out.println(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		System.out.println(pessoasPorAltura);
		return pessoasPorAltura;
	}
	
	public void exibirLista() {
		System.out.println(listaPessoas);
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
		pessoas.adicionarPessoa("Diana", 30, 1.65);
		pessoas.adicionarPessoa("Jardel", 26, 1.83);
		pessoas.adicionarPessoa("Ana", 19, 1.60);
		pessoas.exibirLista();
		pessoas.ordenarPorIdade();
		pessoas.ordenarPorAltura();
	}
}
