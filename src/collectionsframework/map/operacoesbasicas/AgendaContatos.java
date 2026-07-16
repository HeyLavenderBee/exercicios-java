package collectionsframework.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> listaContatos;
	
	public AgendaContatos() {
		listaContatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		listaContatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!listaContatos.isEmpty()) {
			listaContatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		for(String i : listaContatos.keySet()) {
			System.out.println(i+" - Tel: "+listaContatos.get(i));
		}
	}
	
	public Integer pesquisarPorNome(String nome) {
		if(!listaContatos.isEmpty()) {
			return listaContatos.get(nome);
		}
		return null;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Pedro", 123);
		agendaContatos.adicionarContato("Matheus", 9002);
		agendaContatos.adicionarContato("Ana", 7927);
		
		agendaContatos.removerContato("Pedro");
		
		System.out.println("Lista de contatos: ");
		agendaContatos.exibirContatos();
		
		System.out.println();
		System.out.println("Pesquisa de contato pelo nome \"Matheus\": ");
		System.out.println("Número de telefone: "+agendaContatos.pesquisarPorNome("Matheus"));
	}
}
