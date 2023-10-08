package set.OdernacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> listaAlunos;

	public GerenciadorAlunos() {
		this.listaAlunos = new HashSet<>();
	}

	public void adicionarAluno(String nome, long matricula, double media) {
		Aluno aluno = new Aluno(nome, matricula, media);
		listaAlunos.add(aluno);
	}

	public void removerAluno(long matricula) {
		Set<Aluno> alunoRemovido = new HashSet<Aluno>();
		for (Aluno a : listaAlunos) {
			if (a.getMatricula() == matricula) {
				alunoRemovido.add(a);
			}
		}
		listaAlunos.removeAll(alunoRemovido);

		if (alunoRemovido.isEmpty()) {
			System.out.println("Matrícula não encontrada");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<Aluno>(listaAlunos);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<Aluno>(new Aluno.CompararNota());
		alunosPorNota.addAll(listaAlunos);
		return alunosPorNota;
	}

	public Set<Aluno> exibirAlunos() {
		return listaAlunos;
	}

	public static void main(String[] args) {
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		alunos.adicionarAluno("Pedro", 7458, 6.50);
		alunos.adicionarAluno("Rebeca", 1258, 9.40);
		alunos.adicionarAluno("João", 3654, 10.00);
		alunos.adicionarAluno("Ana", 6587, 5.00);
		//alunos.removerAluno(6587);
		System.out.println();
		System.out.println(alunos.exibirAlunosPorNota());

	}

}
