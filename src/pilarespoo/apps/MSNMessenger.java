package pilarespoo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
}
