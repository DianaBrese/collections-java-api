package map.OrdenacaoEmMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
	private Map<LocalDate, Evento> agenda;
	
	public AgendaEventos() {
		this.agenda = new HashMap<LocalDate, Evento>();
	}
	
	public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
		Evento evento = new Evento(nomeEvento, nomeAtracao);
		this.agenda.put(data, evento);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> proximosEventos = new HashMap<LocalDate, Evento>();
		for(Map.Entry<LocalDate, Evento> entry: agenda.entrySet()) {
			if(entry.getKey().isAfter(dataAtual)) {
				LocalDate data = entry.getKey();
				Evento evento = entry.getValue();
				proximosEventos.put(data, evento);
			}
		}
		System.out.println(proximosEventos);
	}
	
	public void exibirAgenda() {
		System.out.println(agenda);
	}

	public static void main(String[] args) {
		AgendaEventos agenda = new AgendaEventos();
		agenda.adicionarEvento(LocalDate.of(2023, 10, 25), "Evento 1", "Atração 1");
		agenda.adicionarEvento(LocalDate.of(2024, 01, 03), "Evento 2", "Atração 2");
		agenda.adicionarEvento(LocalDate.of(2023, 12, 20), "Evento 3", "Atração 3");

		//agenda.exibirAgenda();
		agenda.obterProximoEvento();
		

	}

}
