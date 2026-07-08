package interfaces.exercicio2;

public class Main {
	public static void main() {
		MusicPlayer computer = new Computer();
		runMusic(computer);
		//runVideo(computer) não funciona, alternativas:
		runVideo(new Computer());
		runVideo((VideoPlayer) computer); //não é genérico, evitar
		//ou colocar o tipo dele como computer
		
		var musicPlayer = new MusicPlayer() {
			
			@Override
			public void playMusic() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void pauseMusic() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public static void runVideo(VideoPlayer videoPlayer) {
		videoPlayer.playVideo();
	}
	
	public static void runMusic(MusicPlayer musicPlayer) {
		musicPlayer.playMusic();
	}
}
