package interfaces.exercicio2;

public interface MusicPlayer {
	//não podem ter construtores
	
	//todas as propriedades de interface são públicas, estáticas e final
	public static final String song = ""; //é redundante colocar esses tipos aqui
	
	void playMusic();
	void pauseMusic();
}
