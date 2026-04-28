package pilarespoo.apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	public abstract void salvarHistoricoMensagem();
	
	protected void validarConexaoInternet() {
		System.out.println("Validar se está conectado a internet");
	}
}
