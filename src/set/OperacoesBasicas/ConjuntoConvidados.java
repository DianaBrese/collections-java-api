package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> listaConvidados;

	public ConjuntoConvidados() {
		this.listaConvidados = new HashSet<Convidado>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		this.listaConvidados.add(convidado);
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Set<Convidado> convidadoRemovido = new HashSet<Convidado>();
		for(Convidado c : listaConvidados) {
			if(c.getCodigo() == codigoConvite) {
				convidadoRemovido.add(c);
				break;
			}
		}
		listaConvidados.removeAll(convidadoRemovido);
	}
	
	public void contarConvidados() {
		int count = 0;
		for(Convidado c : listaConvidados) {
			count += 1;
		}
		System.out.println(count + " convidados");
	}

	public void exibirConvidados() {
		System.out.println(this.listaConvidados);
	}

	public static void main(String[] args) {
		ConjuntoConvidados lista = new ConjuntoConvidados();
		lista.adicionarConvidado("Diana", 23);
		lista.adicionarConvidado("Ana", 56);
		lista.adicionarConvidado("João", 75);
		lista.exibirConvidados();
		lista.removerConvidadoPorCodigoConvite(23);
		lista.exibirConvidados();
		lista.contarConvidados();
	}
}
