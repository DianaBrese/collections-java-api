package set.PesquisaEmSet;

import java.util.HashSet;
import java.util.Set;

import set.PesquisaEmSet.Tarefa;

public class ListaTarefas {
	private Set<Tarefa> listaTarefas;

	public ListaTarefas() {
		this.listaTarefas = new HashSet<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		Tarefa tarefa = new Tarefa(descricao);
		this.listaTarefas.add(tarefa);
	}

	public void removerTarefa(String descricao) {
		Set<Tarefa> tarefaParaRemover = new HashSet<Tarefa>();
		for (Tarefa t : listaTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
				break;
			}

		}
		this.listaTarefas.removeAll(tarefaParaRemover);
	}

	public int contarTarefas() {
		int count = 0;
		for (Tarefa t : listaTarefas) {
			count += 1;
		}

		return count;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : listaTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setFoiConcluida(true);
				break;
			}
		}
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> concluidos = new HashSet<Tarefa>();
		for(Tarefa t : listaTarefas) {
			if(t.getFoiConcluida() == true) {
				concluidos.add(t);
			}
		}
		return concluidos;
	}

	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : listaTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setFoiConcluida(false);
				break;
			}
		}
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> pendentes = new HashSet<Tarefa>();
		for(Tarefa t : listaTarefas) {
			if(t.getFoiConcluida() == false) {
				pendentes.add(t);
			}
		}
		return pendentes;
	}
	
	public void limparListaTarefas() {
		Set<Tarefa> limparTarefas = new HashSet<>(listaTarefas);
		this.listaTarefas.removeAll(limparTarefas);
	}

	public void exibirTarefa() {
		System.out.println(listaTarefas);
	}

	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		lista.adicionarTarefa("Limpar quarto");
		lista.adicionarTarefa("Varrer quintal");
		lista.adicionarTarefa("Passear com cachorro");
		lista.exibirTarefa();
		System.out.println(lista.contarTarefas());
		lista.marcarTarefaConcluida("Limpar quarto");
		lista.marcarTarefaConcluida("Varrer quintal");
		lista.marcarTarefaPendente("Passear com cachorro");
		System.out.println(lista.obterTarefasConcluidas());
		System.out.println(lista.obterTarefasPendentes());
		lista.limparListaTarefas();
		lista.exibirTarefa();

		

	}
}
