package pilarespoo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo facebook");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo facebook");
	}

	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
}
