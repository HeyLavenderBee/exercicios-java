package interfaces.exercicio2;

public class Smartphone implements MusicPlayer, VideoPlayer{
	//permite implementar mais de uma interface, algo que não pode com classe abstrata
	
	@Override
	public void playMusic() {
		System.out.println("O smartphone está tocando a música");
	}

	@Override
	public void pauseMusic() {
		System.out.println("O smartphone está pausando a música");
	}

	@Override
	public void playVideo() {
		System.out.println("O smartphone está tocando o vídeo");
	}

	@Override
	public void pauseVideo() {
		System.out.println("O smartphone está pausando o vídeo");
	}

}
