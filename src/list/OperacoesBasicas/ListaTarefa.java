package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (int i = 0; i < tarefaList.size(); i++) {
			if (tarefaList.get(i).getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefaList.get(i));
			}
			tarefaList.removeAll(tarefasParaRemover);
		}

	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println(listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 2");
		
		System.out.println(listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();

	}
}
