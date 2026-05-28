package records;

public record Pessoa (String nome, int idade){
	
	public Pessoa{}
	
	public Pessoa (String nome) {
		this(nome, 1);
	}
	
	public String mostarInformacoes() {
		return "Nome: "+nome+", idade: "+idade;
	}
}
