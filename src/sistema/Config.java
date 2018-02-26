package sistema;

import utils.AudioPlayer;

public class Config {
	
	private AudioPlayer player;
	
	public Config() {
		player = AudioPlayer.getInstance();
	}

	public void configuraAudio(int novoVolume) {
		player.setVolume(novoVolume);
	}
	
	/** Outras configurações **/
}
