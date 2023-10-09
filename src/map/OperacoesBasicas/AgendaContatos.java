package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatos;

	public AgendaContatos() {
		this.agendaContatos = new HashMap<String, Integer>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		this.agendaContatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		this.agendaContatos.remove(nome);
	}

	public void pesquisarPorPalavra(String nome) {
		int telefone = agendaContatos.get(nome);
		System.out.println(telefone);
	}

	public void exibirContatos() {
		System.out.println(this.agendaContatos);
	}

	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();

		agenda.adicionarContato("Joao", 145879624);
		agenda.adicionarContato("Marcos", 25478963);
		System.out.println();

	}
}
