package collectionsframework.map.ordenacaomap;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> listaEventos;
	
	public AgendaEventos() {
		listaEventos = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		listaEventos.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(listaEventos);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(listaEventos);
		Evento proximoEvento = null;
		if(!listaEventos.isEmpty()) {
			for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
				if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
					System.out.println("O próximo evento: " + entry.getValue() + " acontecerá em: " + entry.getKey());
					return;
				}
			}
		}
		System.out.println("Não há eventos futuros na agenda.");
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2026, 8, 2), "Dia do Amigo", "Abraço");
		agendaEventos.adicionarEvento(LocalDate.of(2026, 1, 1), "Festa Ano Novo", "Ceia");
		agendaEventos.adicionarEvento(LocalDate.of(2026, 12, 25), "Natal", "Ceia");
		agendaEventos.adicionarEvento(LocalDate.now(), "Festa Junina", "Fogueira");
		
		System.out.println("Agenda de eventos: ");
		agendaEventos.exibirAgenda();
		
		System.out.println();
		agendaEventos.obterProximoEvento();
	}
}
