package pilarespoo.apps;

public class Telegram extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo telegram");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo telegram");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
}
