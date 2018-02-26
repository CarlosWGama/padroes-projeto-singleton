package sistema;

import utils.AudioPlayer;

public class Piano {

	private AudioPlayer player;
	
	public Piano() {
		player = AudioPlayer.getInstance();
	}
	
	public void teclaX() {
		player.reproduzirAudio("tecla_x.mp3");
	}
}
