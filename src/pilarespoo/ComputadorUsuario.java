package pilarespoo;

import pilarespoo.apps.FacebookMessenger;
import pilarespoo.apps.MSNMessenger;
import pilarespoo.apps.ServicoMensagemInstantanea;
import pilarespoo.apps.Telegram;

public class ComputadorUsuario {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if("msn".equals(appEscolhido)) {
			smi = new MSNMessenger();
		}
		else if ("fcb".equals(appEscolhido)){
			smi = new FacebookMessenger();
		}
		else if ("tlg".equals(appEscolhido)) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
