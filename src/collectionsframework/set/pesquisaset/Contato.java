package collectionsframework.set.pesquisaset;

public class Contato {
	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public void atualizarTelefone(String novoNumero) {
		telefone = novoNumero;
	}
	
	@Override
	public String toString() {
		return "Nome Contato: " + nome + " - Tel: " + telefone;
	}
}
