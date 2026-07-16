package collectionsframework.set.pesquisaset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> listaContatos;
	
	public AgendaContatos() {
		listaContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, String numero) {
		listaContatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		for(Contato c : listaContatos) {
			System.out.println(c);
		}
	}
	
	public Set<Contato> pesquisarPorNome(String nomePesquisado) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : listaContatos) {
			if(c.getNome().startsWith(nomePesquisado)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, String novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : listaContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.atualizarTelefone(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Maria", "123");
		agendaContatos.adicionarContato("Antônio", "456");
		agendaContatos.adicionarContato("Júlia", "789");
		
		System.out.println("Contato atualizado:");
		System.out.println(agendaContatos.atualizarNumeroContato("Maria", "903"));
		System.out.println();
		
		System.out.println("Resultados de contatos com o nome pesquisado: ");
		System.out.println(agendaContatos.pesquisarPorNome("Júl"));
		
		System.out.println();
		System.out.println("Contatos:");
		agendaContatos.exibirContatos();
	}
}
