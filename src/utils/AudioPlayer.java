package utils;

public class AudioPlayer {

	private int volume = 100;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume > 100) volume = 100;
		else if (volume < 0) volume = 0; 
		this.volume = volume;
	}
	
	public void reproduzirAudio(String nomeAudio) {
		System.out.println("Reproduz o �udio: " + nomeAudio + " com volume " + volume);
	}
	
}
