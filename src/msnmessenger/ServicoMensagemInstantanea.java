package msnmessenger;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConexaoInternet() {
		System.out.println("Checando se esta conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
}
