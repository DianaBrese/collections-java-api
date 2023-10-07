package set.PesquisaEmSet;

public class Tarefa {
	private String descricao;
	private boolean foiConcluida;

	public Tarefa(String descricao, boolean foiConcluida) {
		this.descricao = descricao;
		this.foiConcluida = foiConcluida;
	}
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean getFoiConcluida() {
		return foiConcluida;
	}

	public void setFoiConcluida(boolean foiConcluida) {
		this.foiConcluida = foiConcluida;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", foiConcluida=" + foiConcluida + "] \n";
	}
}
