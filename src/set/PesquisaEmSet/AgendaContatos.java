package set.PesquisaEmSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> agendaContato;
	
	public AgendaContatos() {
		this.agendaContato = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, String numero) {
		Contato contato = new Contato(nome, numero);
		this.agendaContato.add(contato);
	}
	
	public void exibirContatos() {
		System.out.println(this.agendaContato);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPesquisado = new HashSet<Contato>();
		for(Contato c : agendaContato) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				contatoPesquisado.add(c);
			}
		}
		return contatoPesquisado;
		
	}
	
	public void atualizarNumeroContato(String nome, String novoNumero) {
		for(Contato c : agendaContato) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setTelefone(novoNumero);
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Diana", "32999326415");
		agenda.adicionarContato("Mario", "3899654785");
		agenda.adicionarContato("Ana", "548889623141");

		agenda.exibirContatos();
		//System.out.println(agenda.pesquisarPorNome("Mario"));
		agenda.atualizarNumeroContato("Ana","3255668855" );
		agenda.exibirContatos();
	}
}
