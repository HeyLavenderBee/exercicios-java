package collectionsframework.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		convidadoSet = new HashSet<Convidado>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(codigoConvite == c.getCodigoConvite()) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		for(Convidado c : convidadoSet) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Maria", 23);
		conjuntoConvidados.adicionarConvidado("Alberto", 50);
		conjuntoConvidados.adicionarConvidado("Vanessa", 34);
		
		conjuntoConvidados.removerConvidadoPorConvite(23);
		
		System.out.println("Quantidade de convidados: "+conjuntoConvidados.contarConvidados());
		System.out.println("Lista de convidados: ");
		conjuntoConvidados.exibirConvidados();
	}
}
